import { NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Node } from 'reactflow';
import { Filter } from '../components/filters/Filter';
import { Dispatch, SetStateAction, useCallback, useEffect, useState } from 'react';
import { useCustomEventListener } from 'react-custom-events';
import { GQLComputeAffectedElementsPayload, GQLFilterDefinition } from '../graphql/query/InteractivityGraphQL.types';
import { computeAffectedElementsQuery } from '../graphql/query/computeAffectedElements';
import { OperationVariables, QueryOptions, useLazyQuery } from '@apollo/client';
import { parseQuery } from '../components/semantic_zoom/LevelOfDetails';

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

export type UseFilterProps = {
  editingContextId: string;
  representationId: string;
  setNodes: Dispatch<SetStateAction<Node<NodeData>[]>>;
  getNodes: () => Node<NodeData>[];
};

export type FilterState =
  | {
      filter: Filter;
      shouldApply?: boolean;
    }
  | Filter;

function isFilter(filter: FilterState): filter is Filter {
  return filter.hasOwnProperty('id');
}

export const useFilter = (props: UseFilterProps): Dispatch<SetStateAction<Node<NodeData>[]>> => {
  const [filters, setFilters] = useState<Map<string, Filter>>(new Map());
  const [filterDefs, setFilterDefs] = useState<GQLFilterDefinition[]>([]);
  const [affectedNodes, setAffectedNodes] = useState<Map<string, string[]>>(new Map());
  const [dnodes, setDNodes] = useState<Node<NodeData>[]>([]);
  const [query] = useLazyQuery(computeAffectedElementsQuery);

  const callback = useCallback(
    (value: Node<NodeData>[] | ((prevNodes: Node<NodeData>[]) => Node<NodeData>[])) => {
      console.log(filters.size);
      if (typeof value === 'function') {
        props.setNodes((prevNodes) => {
          const nodesClone = structuredClone(prevNodes);
          setDNodes(prevNodes);
          const returnNodes = value(filterNodes(nodesClone, filters, affectedNodes));
          return returnNodes;
        });
      } else {
        const nodesClone = structuredClone(value);
        setDNodes(nodesClone);
        const nnnnodes = filterNodes(nodesClone, filters, affectedNodes);
        props.setNodes(nnnnodes);
      }
    },
    [props.setNodes, props.getNodes, filters, affectedNodes]
  );

  useCustomEventListener(
    'set-filter',
    (receivedFilters: FilterState[] | FilterState) => {
      setFilters((prevState) => {
        if (!Array.isArray(receivedFilters)) {
          receivedFilters = [receivedFilters];
        }
        for (let filter of receivedFilters) {
          if (isFilter(filter)) {
            filter = { filter: filter };
          }
          if (filter.shouldApply !== true && prevState.get(filter.filter.id)) {
            console.log('deleting filter');
            // Issue: this doesn't refresh the render
            console.log(prevState.delete(filter.filter.id));
          } else if (filter.shouldApply !== false) {
            prevState.set(filter.filter.id, filter.filter);
          }
        }
        return prevState;
      });
      props.setNodes((nodes) => filterNodes(nodes, filters, affectedNodes));
    },
    [filters, affectedNodes]
  );

  useCustomEventListener('set-filter-definitions', (filterDefs: GQLFilterDefinition[]) => setFilterDefs(filterDefs));

  useEffect(() => {
    query(
      queryParams(
        props.editingContextId,
        props.representationId,
        filterDefs.flatMap((def) => def.modifiers).map((mod) => mod.id)
      )
    ).then((data) => {
      setAffectedNodes(parseQuery(data)!);
    });
  }, [filterDefs, dnodes.length]);

  return callback;
};

function filterNodes(nodes: Node<NodeData>[], filters: Map<string, Filter>, affectedNodes: Map<string, string[]>) {
  const nodesClone = structuredClone(nodes);
  return Array.from(filters.values()).reduce(
    (computedNodes, filter) => filter.apply(computedNodes, affectedNodes),
    nodesClone
  );
}
