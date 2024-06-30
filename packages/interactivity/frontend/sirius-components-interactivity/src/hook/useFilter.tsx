import { NodeData, NodeTypeContext, NodeTypeContextValue } from '@eclipse-sirius/sirius-components-diagrams';
import { Node } from 'reactflow';
import { Filter } from '../components/filters/Filter';
import { Dispatch, SetStateAction, useCallback, useContext, useEffect, useState } from 'react';
import { useCustomEventListener } from 'react-custom-events';
import { useDiagramDescription } from '@eclipse-sirius/sirius-components-diagrams';
import { GQLDiagram } from '@eclipse-sirius/sirius-components-diagrams';
import { setModifierParms } from '../components/filters/ModifierHandler';

// const queryParams = (
//   editingContextId: string,
//   representationId: string,
//   ids: string[]
// ): QueryOptions<OperationVariables, GQLComputeAffectedElementsPayload> => ({
//   query: computeAffectedElementsQuery,
//   fetchPolicy: 'no-cache',
//   variables: {
//     input: {
//       id: crypto.randomUUID(),
//       editingContextId: editingContextId,
//       representationId: representationId,
//       containerIds: ids,
//     },
//   },
// });

export type UseFilterProps = {
  editingContextId: string;
  representationId: string;
  setNodes: Dispatch<SetStateAction<Node<NodeData>[]>>;
  getNodes: () => Node<NodeData>[];
  gqlDiagram: GQLDiagram;
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
  // const [filterDefs, setFilterDefs] = useState<GQLFilterDefinition[]>([]);
  // const [affectedNodes, setAffectedNodes] = useState<Map<string, string[]>>(new Map());
  // const [query] = useLazyQuery(computeAffectedElementsQuery);
  // const [dnodes, setDNodes] = useState<Node<NodeData>[]>([]);

  const { diagramDescription } = useDiagramDescription();
  const { nodeConverters } = useContext<NodeTypeContextValue>(NodeTypeContext);

  useEffect(() => {
    setModifierParms(nodeConverters, diagramDescription, props.gqlDiagram);
  }, [diagramDescription, nodeConverters, props.gqlDiagram]);

  const callback = useCallback(
    (value: Node<NodeData>[] | ((prevNodes: Node<NodeData>[]) => Node<NodeData>[])) => {
      if (typeof value === 'function') {
        props.setNodes((prevNodes) => {
          const nodesClone = structuredClone(prevNodes);
          // setDNodes(prevNodes);
          const returnNodes = value(filterNodes(nodesClone, filters));
          console.log(returnNodes);
          return returnNodes;
        });
      } else {
        const nodesClone = structuredClone(value);
        // setDNodes(nodesClone);
        const nnnnodes = filterNodes(nodesClone, filters);
        console.log(nnnnodes);
        props.setNodes(nnnnodes);
      }
    },
    [props.setNodes, props.getNodes, filters]
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
            console.log('Remove filter');
            prevState.delete(filter.filter.id);
          } else if (filter.shouldApply !== false) {
            console.log('Set filter');
            prevState.set(filter.filter.id, filter.filter);
          }
        }
        return prevState;
      });
      props.setNodes((nodes) => {
        console.log(nodes);
        return filterNodes(nodes, filters);
      });
    },
    [filters]
  );

  // useCustomEventListener('set-filter-definitions', (filterDefs: GQLFilterDefinition[]) => setFilterDefs(filterDefs));

  // useEffect(() => {
  //   query(
  //     queryParams(
  //       props.editingContextId,
  //       props.representationId,
  //       filterDefs.flatMap((def) => def.modifiers).map((mod) => mod.id)
  //     )
  //   ).then((data) => {
  //     setAffectedNodes(parseQuery(data)!);
  //   });
  // }, [filterDefs, dnodes.length]);

  return callback;
};

function filterNodes(nodes: Node<NodeData>[], filters: Map<string, Filter>) {
  const nodesClone = structuredClone(nodes);
  return Array.from(filters.values()).reduce((computedNodes, filter) => filter.apply(computedNodes), nodesClone);
}

// export function parseQuery(data: any): Map<string, string[]> | undefined {
//   data = data.data as any;
//   if (data.affectedElements.__typename === 'ComputeAffectedElementsSuccessPayload') {
//     const payload = data.affectedElements as GQLComputeAffectedElementsSuccessPayload;
//     return new Map(payload.affectedElementIds.map((pair) => [pair.id, pair.affectedElementIds]));
//   }
//   return undefined;
// }
