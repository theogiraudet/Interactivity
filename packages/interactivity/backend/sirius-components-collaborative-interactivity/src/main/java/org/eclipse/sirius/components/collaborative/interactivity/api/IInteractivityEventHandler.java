package org.eclipse.sirius.components.collaborative.interactivity.api;

import org.eclipse.sirius.components.collaborative.api.ChangeDescription;
import org.eclipse.sirius.components.collaborative.diagrams.api.IDiagramContext;
import org.eclipse.sirius.components.collaborative.diagrams.api.IDiagramInput;
import org.eclipse.sirius.components.core.api.IEditingContext;
import org.eclipse.sirius.components.core.api.IPayload;
import reactor.core.publisher.Sinks;

public interface IInteractivityEventHandler {

    boolean canHandle(IInteractivityInput interactivityInput);

    void handle(Sinks.One<IPayload> payloadSink, Sinks.Many<ChangeDescription> changeDescriptionSink, IEditingContext editingContext/*, IInteractivityContext interactivityContext*/, IInteractivityInput interactivityInput);

}
