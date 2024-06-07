import {
  GQLComputeAffectedElementsPayload,
  GQLComputeAffectedElementsSuccessPayload,
  GQLZoomLevel,
} from '../../graphql/query/InteractivityGraphQL.types';
import { OperationVariables, QueryOptions, useApolloClient } from '@apollo/client';
import { computeAffectedElementsQuery } from '../../graphql/query/computeAffectedElements';
import { EventObserver } from '../../hook/EventDispatcher';
import { useEffect } from 'react';
import { NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Node } from 'reactflow';
import { applyModifier } from '../ModifierHandler';

const queryParams = (
  editingContextId: string,
  representationId: string,
  ids: string[]
): QueryOptions<OperationVariables, GQLComputeAffectedElementsPayload> => ({
  query: computeAffectedElementsQuery,
  fetchPolicy: 'no-cache',
  variables: {
    input: {
      id: crypto.randomUUID(),
      editingContextId: editingContextId,
      representationId: representationId,
      containerIds: ids,
    },
  },
});

export type ZoomLevelProps = {
  editingContextId: string;
  representationId: string;
  level: GQLZoomLevel;
  zoomEvent: EventObserver<
    (nodes: Node<NodeData, string>[], setNodes: (nodes: Node<NodeData, string>[]) => Promise<void>) => void
  >;
};

export const LevelOfDetail = (props: ZoomLevelProps) => {
  const client = useApolloClient();

  useEffect(
    () =>
      props.zoomEvent.listen(async (nodes /*, setNodes*/) => {
        const data = await client.query<GQLComputeAffectedElementsPayload>(
          queryParams(
            props.editingContextId,
            props.representationId,
            props.level.filter.modifiers.map((mod) => mod.id)
          )
        );
        return interpretQuery(data, props, nodes /*, setNodes*/);
      }),
    []
  );
  return null;
};

function interpretQuery(
  data: any,
  props: ZoomLevelProps,
  nodes: Node<NodeData, string>[] /*, setNodes: (nodes: Node<NodeData, string>[]) => void*/
) {
  data = data.data as any;
  if (data.affectedElements.__typename === 'ComputeAffectedElementsSuccessPayload') {
    const payload = data.affectedElements as GQLComputeAffectedElementsSuccessPayload;
    const map = new Map(payload.affectedElementIds.map((pair) => [pair.id, pair.affectedElementIds]));
    for (const modifier of props.level.filter.modifiers) {
      const affectedElements = map.get(modifier.id);
      const new_nodes = nodes.filter((node) => affectedElements?.includes(node.data.targetObjectId));
      console.log(structuredClone(new_nodes));
      applyModifier(modifier, new_nodes /*, props.setNodes*/);
    }
  }
}
