package org.eclipse.sirius.components.collaborative.interactivity.handlers;

import com.google.common.collect.Streams;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.components.collaborative.api.ChangeDescription;
import org.eclipse.sirius.components.collaborative.api.ChangeKind;
import org.eclipse.sirius.components.collaborative.api.Monitoring;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityEventHandler;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.SnippetInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.SnippetSuccessPayload;
import org.eclipse.sirius.components.collaborative.interactivity.services.MetamodelsService;
import org.eclipse.sirius.components.core.api.ErrorPayload;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IIdentityService;
import org.eclipse.sirius.components.core.api.IPayload;
import org.eclipse.sirius.components.interactivity.SiriusWebModel;
import org.eclipse.sirius.components.interactivity.Snippet;
import org.eclipse.sirius.components.representations.Message;
import org.eclipse.sirius.components.representations.MessageLevel;
import org.eclipse.sirius.ecore.extender.business.internal.accessor.ecore.EcoreIntrinsicExtender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class SnippetEventHandler implements IInteractivityEventHandler {

    private final Counter counter;
    private final Logger logger = LoggerFactory.getLogger(SnippetEventHandler.class);
    private final IIdentityService identityService;
    private final MetamodelsService metamodelsService;

    public SnippetEventHandler(MeterRegistry meterRegistry, IIdentityService identityService, MetamodelsService metamodelsService) {
        this.counter = Counter.builder(Monitoring.EVENT_HANDLER)
                .tag(Monitoring.NAME, this.getClass().getSimpleName())
                .register(meterRegistry);
        this.identityService = identityService;
        this.metamodelsService = metamodelsService;
    }

    @Override
    public boolean canHandle(IInteractivityInput interactivityInput) {
        return interactivityInput instanceof SnippetInput;
    }

    @Override
    public void handle(Sinks.One<IPayload> payloadSink, Sinks.Many<ChangeDescription> changeDescriptionSink, IEditingContext editingContext, IInteractivityInput interactivityInput) {
        this.counter.increment();
        logger.info("[Monitoring] Beginning of interactivity.snippet");
        long startTime = System.nanoTime();
        ChangeDescription changeDescription = new ChangeDescription(ChangeKind.NOTHING, interactivityInput.representationId(), interactivityInput);
        List<Message> errors = new LinkedList<>();
        IPayload payload = new ErrorPayload(interactivityInput.id(), errors);

        if(interactivityInput instanceof SnippetInput input) {

            var objectOpt = metamodelsService.getModel(editingContext, input.representationId());
            var metamodelOpt = metamodelsService.getDomainName(editingContext, input.representationId())
                    .flatMap(domain -> metamodelsService.getMetamodels(domain, editingContext, input.representationId()));
            var snippetOpt = metamodelOpt.flatMap(meta -> meta.interactivity().getFeatures()
                            .stream()
                            .filter(feature -> feature instanceof Snippet)
                            .map(feature -> (Snippet) feature)
                            .filter(snippet -> snippet.getId().equals(input.snippetId()))
                            .filter(snippet -> snippet.getModel() != null)
                            .findAny());

            if(objectOpt.isPresent() && metamodelOpt.isPresent() && snippetOpt.isPresent()) {
                var model = objectOpt.get();
                var snippet = ((SiriusWebModel) snippetOpt.get().getModel()).getModel();
                var copier = new CustomCopier();
                var snippetClone = copier.copy(EcoreUtil.getRootContainer(snippet));
                copier.copyReferences();
                var snippetEntrypoint = Streams.concat(Streams.stream(snippetClone.eAllContents()), Stream.of(snippetClone)).filter(elem -> identityService.getId(snippet).equals(identityService.getId(elem))).findFirst();
                var focusElementOpt = Streams.stream(model.eResource().getAllContents()).filter(elem -> input.focusElementId().equals(identityService.getId(elem))).findFirst();

                if(snippetEntrypoint.isPresent() && focusElementOpt.isPresent()) {
                    var entrypoint = snippetEntrypoint.get();
                    var focusElement = focusElementOpt.get();
                    var roots = new HashSet<EObject>();
                    var snippetModelRoot = EcoreUtil.getRootContainer(entrypoint);

                    getSnippetRoots(snippetModelRoot, entrypoint.eContainer(), entrypoint, new HashSet<>(), roots);
                    cleanAdapter(snippetModelRoot);
                    var atLeastOneChange = false;
                    for (EObject root : roots) {
                        atLeastOneChange |= insertElement(focusElement, root, errors);
                    }

                    if(atLeastOneChange) {
                        changeDescription = new ChangeDescription(ChangeKind.SEMANTIC_CHANGE, interactivityInput.representationId(), interactivityInput);
                    }
                }

                payload = new SnippetSuccessPayload(interactivityInput.id());
            }
        }

        payloadSink.tryEmitValue(payload);
        changeDescriptionSink.tryEmitNext(changeDescription);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        logger.info("[Monitoring] Execution time for interactivity.snippet: {} ms", duration / 1_000_000);
        logger.info("[Monitoring] End of interactivity.snippet");
    }


    /**
     * A snippet root is all elements transitively connected to the currentElement and having container for container.
     * @param modelRoot the root of the whole model
     * @param container the source of the snippet, the element to have as container
     * @param currentElement the current element from which browse the references
     * @param roots the identified roots of the snippet
     */
    public void getSnippetRoots(EObject modelRoot, EObject container, EObject currentElement, Collection<String> browsedElementIds, Collection<EObject> roots) {
        var id = identityService.getId(currentElement);
        if(browsedElementIds.contains(id) || container == currentElement) {
            return;
        }
        if(currentElement.eContainer() == container) {
            roots.add(currentElement);
        }
        var toBrowse = new LinkedList<EObject>();
        var referencers = EcoreUtil.UsageCrossReferencer.find(currentElement, modelRoot);
        referencers.forEach(setting -> toBrowse.add(setting.getEObject()));
        for(var relation: currentElement.eClass().getEAllReferences()) {
            var references = currentElement.eGet(relation);
            if(references instanceof Collection<?> collection) {
                var collect = (Collection<EObject>) collection;
                toBrowse.addAll(collect);
            } else if(references instanceof EObject eobj) {
                toBrowse.add(eobj);
            } else if(references != null) {
                logger.error("{} is not a supported type.", references.getClass().getSimpleName());
            }
        }
        browsedElementIds.add(id);
        toBrowse.forEach(elem -> getSnippetRoots(modelRoot, container, elem, browsedElementIds, roots));
    }

    /**
     * Place a given element as children of an element.
     * Identify the first containment relation that can contain the given element.
     * A relation can contain the given element if the types are compatible, and:
     * - If the relation can store many elements, then adding the element must not overtake the upper bound of the relation
     * - If the relation cannot store many elements, then the relation must not reference another element
     * @param container
     * @param element
     * @param errors
     * @return true if the element has been inserted, false otherwise
     */
    public boolean insertElement(EObject container, EObject element, List<Message> errors) {
        for(var reference: container.eClass().getEReferences()) {
            if(reference.isContainment() && EcoreUtil.equals(element.eClass(), reference.getEReferenceType())) {
                var content = container.eGet(reference);
                if(reference.isMany() && (reference.getUpperBound() == -1 || (content instanceof Collection<?> collec && collec.size() < reference.getUpperBound() - 1))) {
                    new EcoreIntrinsicExtender().eAdd(container, reference.getName(), element);
                    return true;
                } else if(container.eGet(reference) == null) {
                    new EcoreIntrinsicExtender().eAdd(container, reference.getName(), element);
                    return true;
                }
            }
        }
        errors.add(new Message("No relation of the focus element is enable to receive the snippet.", MessageLevel.ERROR));
        return false;
    }

    public void cleanAdapter(EObject snippetModelRoot) {
        snippetModelRoot.eAdapters().clear();
        var iterator = snippetModelRoot.eAllContents();
        while(iterator.hasNext()) {
            var element = iterator.next();
            element.eAdapters().clear();
        }

    }

}
