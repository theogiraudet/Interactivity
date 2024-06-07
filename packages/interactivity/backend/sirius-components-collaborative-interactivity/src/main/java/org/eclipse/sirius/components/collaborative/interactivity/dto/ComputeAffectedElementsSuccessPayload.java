package org.eclipse.sirius.components.collaborative.interactivity.dto;

import org.eclipse.sirius.components.core.api.IPayload;

import java.util.Objects;
import java.util.UUID;

public record ComputeAffectedElementsSuccessPayload(UUID id, AffectedElementIdsPair[] affectedElementIds) implements IPayload {

    public record AffectedElementIdsPair(String id, String[] affectedElementIds) {}

    public ComputeAffectedElementsSuccessPayload {
        Objects.requireNonNull(id);
    }
}
