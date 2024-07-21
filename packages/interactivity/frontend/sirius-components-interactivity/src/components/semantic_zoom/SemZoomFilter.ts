import { EdgeData, NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Edge, Node } from 'reactflow';
import { Filter } from '../filters/Filter';
import { GQLFilterDefinition } from '../../graphql/query/InteractivityGraphQL.types';
import { applyModifier } from '../filters/ModifierHandler';

export class SemZoomFilter implements Filter {
  readonly id: string;
  private readonly filter: GQLFilterDefinition;
  private readonly affectedNodes: Map<string, string[]>;

  constructor(id: string, filter: GQLFilterDefinition, affectedNodes: Map<string, string[]>) {
    this.id = id;
    this.filter = filter;
    this.affectedNodes = affectedNodes;
  }

  //TODO To implement
  applyOnEdges(edges: Edge<EdgeData>[]): Edge<EdgeData>[] {
    return edges;
  }

  applyOnNodes(nodes: Node<NodeData>[]): Node<NodeData>[] {
    for (const modifier of this.filter.modifiers) {
      const nodeIds = this.affectedNodes.get(modifier.id);
      if (nodeIds) {
        applyModifier(
          modifier,
          nodes.filter((node) => nodeIds.includes(node.data.targetObjectId))
        );
      }
    }
    return nodes;
  }
}
