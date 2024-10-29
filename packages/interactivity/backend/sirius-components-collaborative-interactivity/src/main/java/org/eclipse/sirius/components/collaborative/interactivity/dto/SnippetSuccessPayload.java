package org.eclipse.sirius.components.collaborative.interactivity.dto;

import org.eclipse.sirius.components.core.api.IPayload;

import java.util.Objects;
import java.util.UUID;

public record SnippetSuccessPayload(UUID id) implements IPayload {
    public SnippetSuccessPayload {
        Objects.requireNonNull(id);
    }
}
