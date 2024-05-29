package org.eclipse.sirius.components.collaborative.interactivity;

import org.eclipse.sirius.components.collaborative.api.ChangeDescription;
import org.eclipse.sirius.components.collaborative.diagrams.api.IDiagramContext;
import org.eclipse.sirius.components.collaborative.diagrams.api.IDiagramInput;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityEventHandler;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityEventProcessor;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityInput;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

import java.util.List;
import java.util.Optional;

@Service
public class InteractivityEventProcessor implements IInteractivityEventProcessor {

    private final Logger logger = LoggerFactory.getLogger(InteractivityEventProcessor.class);
    private final List<IInteractivityEventHandler> interactivityEventHandlers;

    public InteractivityEventProcessor(List<IInteractivityEventHandler> interactivityEventHandlers) {
        this.interactivityEventHandlers = interactivityEventHandlers;
    }

    @Override
    public boolean canHandle(IDiagramInput diagramInput) {
        return diagramInput instanceof IInteractivityInput;
    }

    @Override
    public void handle(Sinks.One<IPayload> payloadSink, Sinks.Many<ChangeDescription> changeDescriptionSink, IEditingContext editingContext, IDiagramContext diagramContext, IDiagramInput diagramInput) {
        if (diagramInput instanceof IInteractivityInput interactivityInput) {
            Optional<IInteractivityEventHandler> optionalDiagramEventHandler = this.interactivityEventHandlers.stream().filter(handler -> handler.canHandle(interactivityInput)).findFirst();

            if (optionalDiagramEventHandler.isPresent()) {
                IInteractivityEventHandler interactivityEventHandler = optionalDiagramEventHandler.get();
                interactivityEventHandler.handle(payloadSink, changeDescriptionSink, editingContext/*, this.diagramContext*/, interactivityInput);
            } else {
                this.logger.warn("No handler found for event: {}", interactivityInput);
            }
        }
    }
}
