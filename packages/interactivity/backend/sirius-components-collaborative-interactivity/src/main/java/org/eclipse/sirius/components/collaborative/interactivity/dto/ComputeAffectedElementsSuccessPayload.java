package org.eclipse.sirius.components.collaborative.interactivity.dto;

import org.eclipse.sirius.components.core.api.IPayload;

import java.util.Objects;
import java.util.UUID;

public record ComputeAffectedElementsSuccessPayload(UUID id, String[] affectedElementIds) implements IPayload {

    public ComputeAffectedElementsSuccessPayload {
        Objects.requireNonNull(id);
    }
}
