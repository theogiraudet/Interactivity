import { NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Node } from 'reactflow';
import { Filter } from '../filters/Filter';
import {
  GQLComputeDynamicFilterSuccessPayload,
  GQLFilterDefinition,
  GQLModifier,
} from '../../graphql/query/InteractivityGraphQL.types';
import { applyModifier } from '../filters/ModifierHandler';

export class DynFilter implements Filter {
  readonly id: string;
  private readonly filter: GQLFilterDefinition;
  private readonly show: GQLComputeDynamicFilterSuccessPayload;

  constructor(id: string, filter: GQLFilterDefinition, show: GQLComputeDynamicFilterSuccessPayload) {
    this.id = id;
    this.filter = filter;
    this.show = show;
  }

  apply(nodes: Node<NodeData>[]): Node<NodeData>[] {
    const modifiers = new Map(this.filter.modifiers.map<[string, GQLModifier]>((modifier) => [modifier.id, modifier]));
    const groupedElement = new Map<GQLModifier, string[]>();

    for (const element of this.show.elementIds) {
      const modifier = modifiers.get(element.modifierId)!;
      const list = groupedElement.get(modifier) || [];
      list.push(element.semanticElementId);
      groupedElement.set(modifier, list);
    }

    for (const [modifier, elements] of groupedElement.entries()) {
      applyModifier(
        modifier,
        nodes.filter((node) => elements.includes(node.data.targetObjectId))
      );
    }
    return nodes;
  }
}
