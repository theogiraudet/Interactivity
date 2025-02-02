package org.eclipse.sirius.components.collaborative.interactivity.handlers;

import com.google.common.collect.Iterators;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.components.collaborative.api.ChangeDescription;
import org.eclipse.sirius.components.collaborative.api.ChangeKind;
import org.eclipse.sirius.components.collaborative.api.Monitoring;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityEventHandler;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.ComputeAffectedElementsInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.ComputeAffectedElementsSuccessPayload;
import org.eclipse.sirius.components.collaborative.interactivity.services.Metamodels;
import org.eclipse.sirius.components.collaborative.interactivity.services.MetamodelsService;
import org.eclipse.sirius.components.core.api.ErrorPayload;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IIdentityService;
import org.eclipse.sirius.components.core.api.IPayload;
import org.eclipse.sirius.components.interactivity.Identifiable;
import org.eclipse.sirius.components.interactivity.Path;
import org.eclipse.sirius.components.interactivity.ScopedModifier;
import org.eclipse.sirius.components.interpreter.AQLInterpreter;
import org.eclipse.sirius.components.interpreter.Result;
import org.eclipse.sirius.components.representations.Message;
import org.eclipse.sirius.components.representations.MessageLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;
import java.util.*;

@Service
public class ComputeAffectedElementsEventHandler implements IInteractivityEventHandler  {

    private final MetamodelsService metamodelsService;
    private final IIdentityService identityService;
    private final Counter counter;
    private final Logger logger = LoggerFactory.getLogger(ComputeAffectedElementsEventHandler.class);

    public ComputeAffectedElementsEventHandler(MetamodelsService metamodelsService, IIdentityService identityService, MeterRegistry meterRegistry) {
        this.metamodelsService = metamodelsService;
        this.identityService = identityService;
        this.counter = Counter.builder(Monitoring.EVENT_HANDLER)
                .tag(Monitoring.NAME, this.getClass().getSimpleName())
                .register(meterRegistry);
    }

    @Override
    public boolean canHandle(IInteractivityInput interactivityInput) {
        return interactivityInput instanceof ComputeAffectedElementsInput;
    }

    @Override
    public void handle(Sinks.One<IPayload> payloadSink, Sinks.Many<ChangeDescription> changeDescriptionSink, IEditingContext editingContext, IInteractivityInput interactivityInput) {
        this.counter.increment();
        logger.info("[Monitoring] Beginning of interactivity.semantic_zoom");
        long startTime = System.nanoTime();
        ChangeDescription changeDescription = new ChangeDescription(ChangeKind.NOTHING, interactivityInput.representationId(), interactivityInput);
        List<Message> errors = new LinkedList<>();
        IPayload payload = new ErrorPayload(interactivityInput.id(), errors);
        if(interactivityInput instanceof ComputeAffectedElementsInput input) {
            Optional<Metamodels> metamodelsOpt = metamodelsService.getDomainName(editingContext, interactivityInput.representationId())
                    .flatMap(domain -> metamodelsService.getMetamodels(domain, editingContext, input.representationId()));

            if(metamodelsOpt.isPresent()) {
                Metamodels metamodels = metamodelsOpt.get();

                var iterator = metamodels.interactivity().eAllContents();
                Map<String, String[]> map = new HashMap<>();
                while(iterator.hasNext()) {
                    EObject object = iterator.next();
                    if(object instanceof Identifiable identifiable && List.of(input.containerIds()).contains(identifiable.getId())) {
                        Optional<String> query = Optional.empty();
                        boolean success = true;
                        if(object instanceof ScopedModifier modifier) {
                            query = Optional.of(modifier.getElements()).filter(elem -> elem instanceof Path).map(path -> ((Path) path).getPath());
                        } else {
                            success = false;
                            errors.add(new Message(object.eClass().getName() + " is not a registered Action type.", MessageLevel.ERROR));
                        }

                        if(success) {
                           if(query.isEmpty()) {
                               errors.add(new Message("Query not found.", MessageLevel.ERROR));
                           } else {
                               String[] objectIds = getObjectIds(editingContext, input.representationId(), query.get()).get();
                               map.put(identifiable.getId(), objectIds);

                           }
                        }
                    }
                }
                var value = map.entrySet().stream().map(entry -> new ComputeAffectedElementsSuccessPayload.AffectedElementIdsPair(entry.getKey(), entry.getValue())).toArray(ComputeAffectedElementsSuccessPayload.AffectedElementIdsPair[]::new);
                var returnSize = Arrays.stream(value).reduce(0, (acc, elem) -> acc + elem.affectedElementIds().length, Integer::sum);
                logger.info("[Monitoring] Number of elements returned by interactivity.semantic_zoom: {} elements", returnSize);
                payload = new ComputeAffectedElementsSuccessPayload(interactivityInput.id(), value);
            }
        }
        payloadSink.tryEmitValue(payload);
        changeDescriptionSink.tryEmitNext(changeDescription);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        logger.info("[Monitoring] Execution time for interactivity.semantic_zoom: {} ms", duration / 1_000_000);
        logger.info("[Monitoring] End of interactivity.semantic_zoom");
    }

    private Optional<String[]> getObjectIds(IEditingContext editingContext, String representationId, String query) {
        var objectOpt = metamodelsService.getModel(editingContext, representationId).map(EcoreUtil::getRootContainer);
        if(objectOpt.isPresent()) {
            EObject obj = objectOpt.get();
            AQLInterpreter interpreter = new AQLInterpreter(List.of(), List.of(obj.eClass().getEPackage()));
            Result result = interpreter.evaluateExpression(Map.of("root", obj), query);
            logger.info("Size of the model: {} elements", Iterators.size(obj.eResource().getAllContents()));
//            var nbElements = 0;
//            var nbRelations = 0;
//            var iterator = obj.eClass().getEPackage().eAllContents();
//            while(iterator.hasNext()) {
//                EObject object = iterator.next();
//                if(object instanceof EClassifier clazz) {
//                    nbElements++;
//                    nbRelations += object.eCrossReferences().stream().filter(ref -> ref instanceof EReference).collect(Collectors.toSet()).size();
//                }
//            }
//            logger.info("Size of the metamodel: {} elements, {} relations", nbElements, nbRelations);
            return result.asObjects().map(list -> list.stream().map(identityService::getId).toArray(String[]::new));
        }
        return Optional.empty();
    }
}
