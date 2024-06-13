import { GQLComputeAffectedElementsPayload, GQLFilter } from '../../graphql/query/InteractivityGraphQL.types';
import { EventObserver } from '../../hook/EventDispatcher';
import { Diagram, NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { OperationVariables, QueryOptions, useLazyQuery } from '@apollo/client';
import { computeAffectedElementsQuery } from '../../graphql/query/computeAffectedElements';
import { Instance, Node } from 'reactflow';
import { applyFilter, parseQuery } from '../semantic_zoom/LevelOfDetails';
import { memo, useEffect, useState } from 'react';

export type FilterProps = {
  editingContextId: string;
  representationId: string;
  filter: GQLFilter;
  event: EventObserver<(nodes: Node<NodeData, string>[]) => Promise<void>>;
  diagram: Diagram;
  nodes: Node<NodeData, string>[];
  setNodes: Instance.SetNodes<NodeData>;
};

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

export const Filter = (props: FilterProps) => {
  console.log('Instantiate');

  const [query] = useLazyQuery(computeAffectedElementsQuery);
  const [concernedIds, setConcernedIds] = useState<Map<string, string[]> | undefined>(undefined);

  useEffect(() => {
    query(
      queryParams(
        props.editingContextId,
        props.representationId,
        props.filter.reference.modifiers.map((mod) => mod.id)
      )
    ).then((data) => {
      setConcernedIds(parseQuery(data));
    });
  }, [props.nodes]);

  if (concernedIds) {
    const nodes = structuredClone(props.nodes);
    applyFilter(concernedIds, props.filter.reference, nodes);
    props.setNodes(nodes);
  }

  // useEffect(() => {
  //   const client.query<GQLComputeAffectedElementsPayload>(
  //       queryParams(
  //           props.editingContextId,
  //           props.representationId,
  //           props.filter.reference.modifiers.map((mod) => mod.id)
  //       )
  //   ).then();
  // }, [props.nodes]);

  // useEffect(() => {
  //   props.event.listen(async (nodes) => {
  //     const data = await client.query<GQLComputeAffectedElementsPayload>(
  //       queryParams(
  //         props.editingContextId,
  //         props.representationId,
  //         props.filter.reference.modifiers.map((mod) => mod.id)
  //       )
  //     );
  //     return interpretQuery(data, props.filter.reference, nodes);
  //   });
  // }, []);

  return null;
};

export const FilterMemo = memo(Filter);
