package org.eclipse.sirius.components.collaborative.interactivity.dto;

import org.eclipse.sirius.components.core.api.IPayload;
import org.eclipse.sirius.components.interactivity.Interactivity;

import java.util.Objects;
import java.util.UUID;

public record InteractivityModelSuccessPayload(UUID id, Interactivity interactivity) implements IPayload {

    public InteractivityModelSuccessPayload {
        Objects.requireNonNull(id);
    }
}
