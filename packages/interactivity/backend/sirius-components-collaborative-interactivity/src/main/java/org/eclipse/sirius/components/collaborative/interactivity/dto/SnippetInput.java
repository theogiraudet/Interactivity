package org.eclipse.sirius.components.collaborative.interactivity.dto;

import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityInput;

import java.util.UUID;

public record SnippetInput(UUID id, String representationId, String editingContextId, String focusElementId, String snippetId) implements IInteractivityInput {
}
