package org.eclipse.sirius.components.collaborative.interactivity.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.components.collaborative.api.ChangeDescription;
import org.eclipse.sirius.components.collaborative.api.ChangeKind;
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
import org.eclipse.sirius.components.interactivity.Action;
import org.eclipse.sirius.components.interpreter.AQLInterpreter;
import org.eclipse.sirius.components.interpreter.Result;
import org.eclipse.sirius.components.representations.Message;
import org.eclipse.sirius.components.representations.MessageLevel;
import org.eclipse.sirius.components.semantic_zoom.LevelOfDetail;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ComputeAffectedElementsEventHandler implements IInteractivityEventHandler  {

    private final MetamodelsService metamodelsService;
    private final IIdentityService identityService;

    public ComputeAffectedElementsEventHandler(MetamodelsService metamodelsService, IIdentityService identityService) {
        this.metamodelsService = metamodelsService;
        this.identityService = identityService;
    }

    @Override
    public boolean canHandle(IInteractivityInput interactivityInput) {
        return interactivityInput instanceof ComputeAffectedElementsInput;
    }

    @Override
    public void handle(Sinks.One<IPayload> payloadSink, Sinks.Many<ChangeDescription> changeDescriptionSink, IEditingContext editingContext, IInteractivityInput interactivityInput) {
        ChangeDescription changeDescription = new ChangeDescription(ChangeKind.NOTHING, interactivityInput.representationId(), interactivityInput);
        List<Message> errors = new LinkedList<>();
        IPayload payload = new ErrorPayload(interactivityInput.id(), errors);
        if(interactivityInput instanceof ComputeAffectedElementsInput input) {
            Optional<Metamodels> metamodelsOpt = metamodelsService.getDomainName(editingContext, interactivityInput.representationId())
                    .flatMap(metamodelsService::getMetamodels);

            if(metamodelsOpt.isPresent()) {
                Metamodels metamodels = metamodelsOpt.get();

                var iterator = metamodels.interactivity().eAllContents();
                while(iterator.hasNext()) {
                    EObject object = iterator.next();
                    if(object instanceof Action action && action.getName().equals(input.actionId())) {
                        Optional<String> query = Optional.empty();
                        boolean success = true;
                        if(object instanceof LevelOfDetail levelOfDetail) {
                            query = Optional.of(levelOfDetail.getHiddenASElements());
                        } else {
                            success = false;
                            errors.add(new Message(object.eClass().getName() + " is not a registered Action type.", MessageLevel.ERROR));
                        }

                        if(success) {
                           if(query.isEmpty()) {
                               errors.add(new Message("Query not found.", MessageLevel.ERROR));
                           } else {
                               String[] objectIds = getObjectIds(editingContext, input.representationId(), query.get()).get();
                               payload = new ComputeAffectedElementsSuccessPayload(interactivityInput.id(), objectIds);

                           }
                        }
                        break;
                    }
                }
            }
        }
        payloadSink.tryEmitValue(payload);
        changeDescriptionSink.tryEmitNext(changeDescription);
    }

    private Optional<String[]> getObjectIds(IEditingContext editingContext, String representationId, String query) {
        var objectOpt = metamodelsService.getModel(editingContext, representationId);
        if(objectOpt.isPresent()) {
            EObject obj = objectOpt.get();
            AQLInterpreter interpreter = new AQLInterpreter(List.of(), List.of(obj.eClass().getEPackage()));
            Result result = interpreter.evaluateExpression(Map.of("root", obj), query);
        return result.asObjects().map(list -> list.stream().map(identityService::getId).toArray(String[]::new));
        }
        return Optional.empty();
    }
}
