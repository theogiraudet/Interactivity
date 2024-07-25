package org.eclipse.sirius.components.collaborative.interactivity.dto;

import org.eclipse.sirius.components.core.api.IPayload;
import org.eclipse.sirius.components.interactivity.Interactivity;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public record SemanticSearchSuccessPayload(UUID id, List<String> semanticElementIds) implements IPayload {

    public SemanticSearchSuccessPayload {
        Objects.requireNonNull(id);
    }
}
