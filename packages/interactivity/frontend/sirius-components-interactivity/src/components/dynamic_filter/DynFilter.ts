import { NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Node } from 'reactflow';
import { Filter } from '../filters/Filter';
import { GQLFilterDefinition } from '../../graphql/query/InteractivityGraphQL.types';
import { applyModifier } from '../filters/ModifierHandler';

export class DynFilter implements Filter {
  readonly id: string;
  private readonly filter: GQLFilterDefinition;
  private readonly focusedElement: string;

  constructor(id: string, filter: GQLFilterDefinition, focusedElement: string) {
    this.id = id;
    this.filter = filter;
    this.focusedElement = focusedElement;
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
