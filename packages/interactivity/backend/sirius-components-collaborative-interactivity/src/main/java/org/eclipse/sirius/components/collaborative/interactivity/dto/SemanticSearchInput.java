package org.eclipse.sirius.components.collaborative.interactivity.dto;

import org.eclipse.sirius.components.collaborative.interactivity.api.IInteractivityInput;

import java.util.UUID;

public record SemanticSearchInput(UUID id, String representationId, String editingContextId, String input) implements IInteractivityInput {}
