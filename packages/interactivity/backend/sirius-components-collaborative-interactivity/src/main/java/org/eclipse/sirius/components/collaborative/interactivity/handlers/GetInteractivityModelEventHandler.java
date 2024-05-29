package org.eclipse.sirius.components.collaborative.interactivity.handlers;

import org.eclipse.sirius.components.collaborative.api.ChangeDescription;
import org.eclipse.sirius.components.collaborative.api.ChangeKind;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityEventHandler;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.GetInteractivityModelInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.InteractivityModelSuccessPayload;
import org.eclipse.sirius.components.collaborative.interactivity.services.Metamodels;
import org.eclipse.sirius.components.collaborative.interactivity.services.MetamodelsService;
import org.eclipse.sirius.components.core.api.*;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;
import java.util.Optional;

@Service
public class GetInteractivityModelEventHandler implements IInteractivityEventHandler {

    private final MetamodelsService service;

    public GetInteractivityModelEventHandler(MetamodelsService service) {
        this.service = service;
    }

    @Override
    public boolean canHandle(IInteractivityInput interactivityInput) {
        return interactivityInput instanceof GetInteractivityModelInput;
    }

    @Override
    public void handle(Sinks.One<IPayload> payloadSink, Sinks.Many<ChangeDescription> changeDescriptionSink, IEditingContext editingContext, IInteractivityInput interactivityInput) {
        ChangeDescription changeDescription = new ChangeDescription(ChangeKind.NOTHING, interactivityInput.representationId(), interactivityInput);
        IPayload payload = new SuccessPayload(interactivityInput.id());


        Optional<Metamodels> metamodelsOpt = service.getDomainName(editingContext, interactivityInput.representationId())
                .flatMap(service::getMetamodels);

        if(metamodelsOpt.isPresent()) {
            Metamodels metaModels = metamodelsOpt.get();
            payload = new InteractivityModelSuccessPayload(interactivityInput.id(), metaModels.interactivity());
        }
        payloadSink.tryEmitValue(payload);
        changeDescriptionSink.tryEmitNext(changeDescription);
    }
}
