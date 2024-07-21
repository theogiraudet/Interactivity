import { EdgeData, NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Edge, Node } from 'reactflow';
import { Filter } from '../filters/Filter';
import {
  GQLComputeDynamicFilterSuccessPayload,
  GQLFilter,
  GQLFilterDefinition,
  GQLModifier,
} from '../../graphql/query/InteractivityGraphQL.types';
import { applyModifier } from '../filters/ModifierHandler';

export class DynFilter implements Filter {
  readonly id: string;
  private readonly filterDef: GQLFilterDefinition;
  private readonly filter: GQLFilter;
  private readonly show: GQLComputeDynamicFilterSuccessPayload;

  constructor(
    id: string,
    filterDef: GQLFilterDefinition,
    filter: GQLFilter,
    show: GQLComputeDynamicFilterSuccessPayload
  ) {
    this.id = id;
    this.filterDef = filterDef;
    this.show = show;
    this.filter = filter;
  }

  applyOnNodes(nodes: Node<NodeData>[]): Node<NodeData>[] {
    const modifiers = new Map(
      this.filterDef.modifiers.map<[string, GQLModifier]>((modifier) => [modifier.id, modifier])
    );
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

    const ids = this.show.elementIds.map((id) => id.semanticElementId);
    const notAffected = nodes.filter((node) => !ids.includes(node.data.targetObjectId));
    applyModifier(this.filter.defaultModifier, notAffected);

    return nodes;
  }

  applyOnEdges(edges: Edge<EdgeData>[]): Edge<EdgeData>[] {
    const list: Edge<EdgeData>[] = [];
    for (const edge of edges) {
      if (this.show.edges.includes(edge.id)) {
        list.push(edge);
      }
    }
    return list;
  }
}
