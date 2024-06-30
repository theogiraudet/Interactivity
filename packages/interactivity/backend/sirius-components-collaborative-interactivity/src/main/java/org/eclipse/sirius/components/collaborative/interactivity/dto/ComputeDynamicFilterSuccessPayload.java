package org.eclipse.sirius.components.collaborative.interactivity.dto;

import org.eclipse.sirius.components.core.api.IPayload;

import java.util.List;
import java.util.UUID;

public record ComputeDynamicFilterSuccessPayload(UUID id, List<SemanticElementModifier> elementIds, List<RelationEdgeMapping> edges) implements IPayload {
}
