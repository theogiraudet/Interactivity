package org.eclipse.sirius.components.collaborative.interactivity.handlers;

import org.eclipse.sirius.components.collaborative.api.ChangeDescription;
import org.eclipse.sirius.components.collaborative.api.ChangeKind;
import org.eclipse.sirius.components.collaborative.api.IRepresentationSearchService;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityEventHandler;
import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityInput;
import org.eclipse.sirius.components.collaborative.interactivity.dto.SemanticZoomInput;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IFeedbackMessageService;
import org.eclipse.sirius.components.core.api.IPayload;
import org.eclipse.sirius.components.core.api.SuccessPayload;
import org.eclipse.sirius.components.diagrams.Diagram;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Sinks;

@Service
public class SemanticZoomEventHandler implements IInteractivityEventHandler {

    private final IRepresentationSearchService representationSearchService;
    private final IFeedbackMessageService feedbackMessageService;

    public SemanticZoomEventHandler(IRepresentationSearchService representationSearchService, IFeedbackMessageService feedbackMessageService) {
        this.representationSearchService = representationSearchService;
        this.feedbackMessageService = feedbackMessageService;
    }

    @Override
    public boolean canHandle(IInteractivityInput interactivityInput) {
        return interactivityInput instanceof SemanticZoomInput;
    }

    @Override
    public void handle(Sinks.One<IPayload> payloadSink, Sinks.Many<ChangeDescription> changeDescriptionSink, IEditingContext editingContext, IInteractivityInput interactivityInput) {
        var diagramOpt = this.representationSearchService.findById(editingContext, interactivityInput.representationId(), Diagram.class);
        if(diagramOpt.isPresent()) {
            var diagram = diagramOpt.get();
            // We can use
        }


        var changeDescription = new ChangeDescription(ChangeKind.NOTHING, interactivityInput.representationId(), interactivityInput);
        var payload = new SuccessPayload(interactivityInput.id(), this.feedbackMessageService.getFeedbackMessages());
        payloadSink.tryEmitValue(payload);
        changeDescriptionSink.tryEmitNext(changeDescription);
    }
}
