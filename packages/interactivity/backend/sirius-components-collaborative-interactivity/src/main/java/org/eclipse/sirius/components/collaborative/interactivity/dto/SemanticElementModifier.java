package org.eclipse.sirius.components.collaborative.interactivity.dto;

import java.util.Objects;

public record SemanticElementModifier(String semanticElementId, String modifierId) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SemanticElementModifier that = (SemanticElementModifier) o;
        return Objects.equals(modifierId, that.modifierId) && Objects.equals(semanticElementId, that.semanticElementId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(semanticElementId, modifierId);
    }
}
