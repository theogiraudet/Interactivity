package org.eclipse.sirius.components.collaborative.interactivity.handlers;

import com.google.common.collect.Iterators;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.components.collaborative.api.ChangeDescription;
import org.eclipse.sirius.components.collaborative.api.ChangeKind;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityEventHandler;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.ComputeDynamicFilterInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.ComputeDynamicFilterSuccessPayload;
import org.eclipse.sirius.components.collaborative.interactivity.dto.SemanticElementModifier;
import org.eclipse.sirius.components.collaborative.interactivity.services.MetamodelsService;
import org.eclipse.sirius.components.core.api.ErrorPayload;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IIdentityService;
import org.eclipse.sirius.components.core.api.IPayload;
import org.eclipse.sirius.components.diagrams.Diagram;
import org.eclipse.sirius.components.diagrams.Edge;
import org.eclipse.sirius.components.diagrams.Node;
import org.eclipse.sirius.components.emf.services.IDAdapter;
import org.eclipse.sirius.components.interactivity.*;
import org.eclipse.sirius.components.interpreter.AQLInterpreter;
import org.eclipse.sirius.components.interpreter.Result;
import org.eclipse.sirius.components.representations.Message;
import org.eclipse.sirius.components.view.diagram.DiagramDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

import java.util.*;

@Service
public class ComputeDynamicFilterEventHandler implements IInteractivityEventHandler {

    private final Logger logger = LoggerFactory.getLogger(ComputeDynamicFilterEventHandler.class);

    private final IIdentityService identityService;
    private final MetamodelsService metamodelsService;

    public ComputeDynamicFilterEventHandler(IIdentityService identityService, MetamodelsService metamodelsService) {
        this.identityService = identityService;
        this.metamodelsService = metamodelsService;
    }

    @Override
    public boolean canHandle(IInteractivityInput interactivityInput) {
        return interactivityInput instanceof ComputeDynamicFilterInput;
    }

    @Override
    public void handle(Sinks.One<IPayload> payloadSink, Sinks.Many<ChangeDescription> changeDescriptionSink, IEditingContext editingContext, IInteractivityInput interactivityInput) {
        logger.info("[Monitoring] Beginning of interactivity.dynamic_filter");
        long startTime = System.nanoTime();
        ChangeDescription changeDescription = new ChangeDescription(ChangeKind.NOTHING, interactivityInput.representationId(), interactivityInput);
        List<Message> errors = new LinkedList<>();
        IPayload payload = new ErrorPayload(interactivityInput.id(), errors);

        if (interactivityInput instanceof ComputeDynamicFilterInput input) {
            var objectOpt = metamodelsService.getModel(editingContext, input.representationId());
            var metamodelOpt = metamodelsService.getDomainName(editingContext, input.representationId())
                    .flatMap(domain -> metamodelsService.getMetamodels(domain, editingContext, input.representationId()));
            var filterOpt = metamodelOpt.flatMap(meta -> meta.interactivity().getFeatures()
                    .stream()
                    .filter(feature -> feature instanceof DynamicFilter)
                    .map(feature -> (DynamicFilter) feature)
                    .filter(filter -> filter.getId().equals(input.filterId()))
                    .findAny()
            );
            var filterDefinitionOpt = filterOpt.map(DynamicFilter::getFilter);
            if (objectOpt.isPresent() && filterDefinitionOpt.isPresent()) {
//                EObject model = EcoreUtil.getRootContainer(objectOpt.get());
                EObject model = objectOpt.get();
                var size = Iterators.size(model.eResource().getAllContents());
                logger.info("[Monitoring] Number of elements in the current model: {} elements", size);
                Optional<ContextualSlice> sliceOpt = slice(model, input.focusedElementId());
                if (sliceOpt.isPresent()) {
                    var diagram = metamodelsService.getRepresentation(editingContext, input.representationId());
                    var diagramDescription = metamodelOpt.get().representationDescription();
                    ContextualSlice slice = sliceOpt.get();
                    Context context = new Context(new HashSet<>(), new LinkedList<>(), model);
                    computeAffectedElements(slice.focus, slice.slice, filterDefinitionOpt.get(), context, 0, filterOpt.get().getRadius(), diagram.get(), (DiagramDescription) diagramDescription);
                    logger.info("[Monitoring] Number of elements returned by interactivity.dynamic_filter: {} elements", context.semanticElementIds());
                    payload = new ComputeDynamicFilterSuccessPayload(input.id(), List.copyOf(context.semanticElementIds()), context.edgesToShow());
                }
            }
        }
        payloadSink.tryEmitValue(payload);
        changeDescriptionSink.tryEmitNext(changeDescription);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        logger.info("[Monitoring] Execution time for interactivity.dynamic_filter: {} ms", duration / 1_000_000);
        logger.info("[Monitoring] End of interactivity.dynamic_filter");
    }

    public record Context(Set<SemanticElementModifier> semanticElementIds, List<String> edgesToShow, EObject model) {
    }

    public record Relations(Object sourceObject, List<Object> targetObjects, String relationName, String modifierId) {
    }

    public record Pair<T1, T2>(T1 t1, T2 t2) {
    }

    public void computeAffectedElements(EObject source, EObject root, FilterDefinition filter, Context context, int currentRadius, Radius radius, Diagram diagram, DiagramDescription representationDescription) {
        Map<String, Object> references = new HashMap<>();
        // Store Object with Modifier ID
        Map<Integer, Pair<Object, String>> semanticElementsToShow = new HashMap<>();
        List<Relations> referencesToShow = new LinkedList<>();

        // Save all references
        for (var reference : source.eClass().getEReferences()) {
            CustomCopier copier = new CustomCopier();
            if (source.eGet(reference) instanceof EList<? extends Object> l) {
                var list = new BasicEList<>();
                var cloned = l.stream().map(obj -> (EObject) obj).map(copier::copy).toList();
                list.addAll(cloned);
                references.put(reference.getName(), list);
            } else {
                references.put(reference.getName(), copier.copy((EObject) source.eGet(reference)));
            }
        }

        // Remove all references from the source
        for (var referenceName : references.keySet()) {
            var feature = source.eClass().getEStructuralFeature(referenceName);
            if (!feature.isDerived()) {
                if (source.eGet(feature) instanceof EList<? extends Object> l) {
                    source.eSet(feature, new BasicEList<>());
                } else {
                    source.eSet(feature, null);
                }
            }
        }

        // Test the queries on each reference
        for (var reference : references.entrySet()) {
            if (!source.eClass().getEStructuralFeature(reference.getKey()).isDerived()) {
                source.eSet(source.eClass().getEStructuralFeature(reference.getKey()), reference.getValue());
                for (ScopedModifier modifier : filter.getModifiers()) {
                    AQLInterpreter interpreter = new AQLInterpreter(List.of(), List.of(root.eClass().getEPackage()));
                    Result result = interpreter.evaluateExpression(Map.of("root", root), ((Path) modifier.getElements()).getPath());
                    result.asObjects().ifPresent(objs -> {
                        var pairs = objs.stream().map(obj -> new Pair<>(obj, modifier.getId())).toList();
                        for (var pair : pairs) {
                            semanticElementsToShow.put(System.identityHashCode(pair.t1), pair);
                        }
                        // If the result contains only self, we don't want to show the relation
                        if (!(pairs.size() == 1 && pairs.get(0).t1.equals(source)) && !pairs.isEmpty()) {
                            referencesToShow.add(new Relations(source, objs, reference.getKey(), modifier.getId()));
                        }
                    });
                }

                var feature = source.eClass().getEStructuralFeature(reference.getKey());
                if (source.eGet(feature) instanceof EList<? extends Object>) {
                    source.eSet(feature, new BasicEList<>());
                } else {
                    source.eSet(feature, null);
                }
            }
        }

        // Restore relations
        for (var reference : references.entrySet()) {
            var feature = source.eClass().getEStructuralFeature(reference.getKey());
            if (!feature.isDerived()) {
                source.eSet(source.eClass().getEStructuralFeature(reference.getKey()), reference.getValue());
            }
        }

        // Propagation
        var propagateTo = semanticElementsToShow.values().stream()
                .filter(elem -> context.semanticElementIds()
                        .stream()
                        .noneMatch(id -> Optional.ofNullable(identityService.getId((EObject) elem.t1))
                                .map(id2 -> id.semanticElementId().equals(id2))
                                .isPresent()
                        )
                ).filter(p -> !EcoreUtil.equals((EObject) p.t1(), source))
                .toList(); // Avoid propagation on browsed elements
        computeIds(semanticElementsToShow.values(), referencesToShow, root, context, diagram, representationDescription);

        if (radius != null) {
            if (radius instanceof FixedRadius fixedRadius && fixedRadius.getValue() <= currentRadius) {
                return;
                //TODO implement bounded radius
            } else if (radius instanceof BoundedRadius boundedRadius && boundedRadius.getMax() <= currentRadius) {
                return;
            }
        }
        for (var obj : propagateTo) {
            if (obj.t1 instanceof EObject eobj) {
                var idOpt = identityService.getId(eobj);
                var slicedOpt = slice(context.model(), idOpt);
                if (slicedOpt.isPresent()) {
                    var sliced = slicedOpt.get();
                    computeAffectedElements(sliced.focus, sliced.slice, filter, context, currentRadius + 1, radius, diagram, representationDescription);
                }
            }
        }
    }

    private void computeIds(Collection<Pair<Object, String>> semanticElementsToShow, List<Relations> referencesToShow, EObject model, Context context, Diagram diagram, DiagramDescription representationDescription) {
        for (var semanticElement : semanticElementsToShow) {
//            Optional.ofNullable(identityService.getId(semanticElement.t1()))
//                    .ifPresent(id -> context.semanticElementIds().add(new SemanticElementModifier(id, semanticElement.t2())));
            Optional.ofNullable(identityService.getId(semanticElement.t1()))
                    .ifPresent(id -> context.semanticElementIds().add(new SemanticElementModifier(id, semanticElement.t2())));
        }
        for (var relation : referencesToShow) {
            // Change these IDs too
            String sourceId = identityService.getId(relation.sourceObject);
            List<String> targetIds = relation.targetObjects().stream().map(identityService::getId)
                    .filter(Objects::nonNull)
                    .toList();

            // Get the edges that have for source and target defined in the relation
            var edges = diagram.getEdges().stream().filter(edge -> edge.getTargetObjectId().equals(sourceId) &&
                            getSemanticIdFromNodeId(edge.getTargetId(), diagram.getNodes()).filter(targetIds::contains).isPresent())
                    .map(Edge::getId)
                    .toList();

            context.edgesToShow.addAll(edges);
            // For each found edges, we get the description
//            List<String> descriptionIds = new LinkedList<>();
//            for(var edge: edges) {
//                var edgeDescOpt = representationDescription.getEdgeDescriptions()
//                        .stream()
//                        .filter(edgeDescription -> edge.getDescriptionId().contains(identityService.getId(edgeDescription)) && edgeDescription.getTargetNodesExpression().endsWith(relation.relationName)).findAny();
//                if(edgeDescOpt.isPresent()) {
//                    descriptionIds.add(edge.getDescriptionId());
//                }
//            }

//            if(!descriptionIds.isEmpty()) {
//                context.relationEdgeMappings().add(new RelationEdgeMapping(sourceId, targetIds, descriptionIds.get(0)));
//            } else {
//                logger.warn("No description ID found.");
//            }
        }
    }

    private Optional<EObject> search(EObject clone, EObject model, String sourceObjectId) {
        var iterator = model.eAllContents();
        EObject obj = null;
        while (iterator.hasNext() && obj == null) {
            var next = iterator.next();
            if (sourceObjectId != null && sourceObjectId.equals(identityService.getId(next))) {
                return Optional.of(next);
//                obj = next;
            }
        }

        if (obj != null) {
            iterator = clone.eAllContents();
            while (iterator.hasNext()) {
                var next = iterator.next();
                if (EcoreUtil.equals(next, obj)) {
                    return Optional.of(next);
                }
            }
        }

        return Optional.empty();
    }

    private Optional<ContextualSlice> slice(EObject model, String sourceObjectId) {
//        EObject clone = EcoreUtil.copy(model);
        CustomCopier copier = new CustomCopier();
        EObject clone = copier.copy(model);
        copier.copyReferences();
        var sourceOpt = search(clone, model, sourceObjectId).map(copier::get);
//        var sourceOpt = search(clone, model, sourceObjectId);
        if (sourceOpt.isPresent()) {
            EObject source = sourceOpt.get();
            while (source.eContainer() != null) {
                EObject parent = source.eContainer();
                EStructuralFeature containingFeature = source.eContainingFeature();
                Object container = parent.eGet(containingFeature);
                if (container instanceof Collection collection) {
                    collection.clear();
                    collection.add(source);
                }
                source = parent;
            }
            return Optional.of(new ContextualSlice(sourceOpt.get(), clone));
        }
        return Optional.empty();
    }

    record ContextualSlice(EObject focus, EObject slice) {
    }

//    private Optional<String> getOriginalEObjectId(EObject cloned, EObject clonedModel, EObject model) {
//        var iterator = model.eAllContents();
//        while (iterator.hasNext()) {
//            var next = iterator.next();
//            if (EcoreUtil.equals(cloned, next)) {
//                return Optional.of(identityService.getId(next));
//            }
//        }
//        return Optional.empty();
//    }

    private Optional<String> getSemanticIdFromNodeId(String nodeId, List<Node> nodes) {
        return nodes.stream().filter(node -> node.getId().equals(nodeId)).map(Node::getTargetObjectId).findAny();
    }


}