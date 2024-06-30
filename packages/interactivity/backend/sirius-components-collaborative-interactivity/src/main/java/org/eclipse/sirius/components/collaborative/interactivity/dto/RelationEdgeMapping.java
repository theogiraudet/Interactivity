package org.eclipse.sirius.components.collaborative.interactivity.dto;

import java.util.List;

public record RelationEdgeMapping(String sourceObjectId, List<String> targetObjectIds, String edgeDescription) {
}
