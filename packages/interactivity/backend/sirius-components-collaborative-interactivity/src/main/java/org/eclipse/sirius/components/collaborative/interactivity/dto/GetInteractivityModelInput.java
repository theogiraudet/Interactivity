package org.eclipse.sirius.components.collaborative.interactivity.dto;

import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityInput;

import java.util.UUID;

public record GetInteractivityModelInput(UUID id, String representationId, String editingContextId) implements IInteractivityInput {
}
