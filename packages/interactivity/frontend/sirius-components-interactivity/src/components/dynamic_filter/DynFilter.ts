import { NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Node } from 'reactflow';
import { Filter } from '../Filter';
import { GQLFilterDefinition } from '../../graphql/query/InteractivityGraphQL.types';
import { applyModifier } from '../ModifierHandler';

export class DynFilter implements Filter {
  readonly id: string;
  private readonly filter: GQLFilterDefinition;

  constructor(id: string, filter: GQLFilterDefinition) {
    this.id = id;
    this.filter = filter;
  }

  apply(nodes: Node<NodeData>[], affectedNodes: Map<string, string[]>): Node<NodeData>[] {
    for (const modifier of this.filter.modifiers) {
      const nodeIds = affectedNodes.get(modifier.id);
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
