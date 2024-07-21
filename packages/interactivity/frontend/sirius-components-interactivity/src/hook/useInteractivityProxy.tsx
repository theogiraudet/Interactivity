import {
  convertDiagram,
  Diagram,
  EdgeData,
  NodeData,
  NodeTypeContext,
  NodeTypeContextValue,
} from '@eclipse-sirius/sirius-components-diagrams';
import { Edge, Node } from 'reactflow';
import { Filter } from '../components/filters/Filter';
import { Dispatch, SetStateAction, useCallback, useContext, useEffect, useState } from 'react';
import { useCustomEventListener } from 'react-custom-events';
import { useDiagramDescription } from '@eclipse-sirius/sirius-components-diagrams';
import { GQLDiagram } from '@eclipse-sirius/sirius-components-diagrams';
import { setModifierParms } from '../components/filters/ModifierHandler';

export type UseFilterProps = {
  editingContextId: string;
  representationId: string;
  setNodes: Dispatch<SetStateAction<Node<NodeData>[]>>;
  setEdges: Dispatch<SetStateAction<Edge<EdgeData>[]>>;
  getNodes: () => Node<NodeData>[];
  getEdges: () => Edge<EdgeData>[];
  gqlDiagram: GQLDiagram;
  convertedDiagram: Diagram | undefined;
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

export const useInteractivityProxy = (
  props: UseFilterProps
): [Dispatch<SetStateAction<Node<NodeData>[]>>, Dispatch<SetStateAction<Edge<EdgeData>[]>>, Node<NodeData>[]] => {
  const [filters, setFilters] = useState<Map<string, Filter>>(new Map());

  const { diagramDescription } = useDiagramDescription();
  const { nodeConverters } = useContext<NodeTypeContextValue>(NodeTypeContext);
  const [internalNodes, setInternalNodes] = useState<Node<NodeData>[]>([]);

  useEffect(() => {
    setModifierParms(nodeConverters, diagramDescription, props.gqlDiagram);
  }, [diagramDescription, nodeConverters, props.gqlDiagram]);

  const callbackSetNode = useCallback(
    (value: Node<NodeData>[] | ((prevNodes: Node<NodeData>[]) => Node<NodeData>[])) => {
      if (typeof value === 'function') {
        props.setNodes((prevNodes) => {
          const nodesClone = structuredClone(prevNodes);
          const nodes = value(filterNodes(nodesClone, filters));
          setInternalNodes(nodes);
          return nodes;
        });
      } else {
        const nodesClone = structuredClone(value);
        const nodes = filterNodes(nodesClone, filters);
        props.setNodes(nodes);
        setInternalNodes(nodes);
      }
    },
    [props.setNodes, filters]
  );

  const callbackSetEdge = useCallback(
    (value: Edge<EdgeData>[] | ((prevEdges: Edge<EdgeData>[]) => Edge<EdgeData>[])) => {
      if (typeof value === 'function') {
        props.setEdges((prevEdges) => {
          const edgesClone = structuredClone(prevEdges);
          return value(filterEdges(edgesClone, filters));
        });
      } else {
        const edgesClone = structuredClone(value);
        props.setEdges(filterEdges(edgesClone, filters));
      }
    },
    [props.setEdges, filters]
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
      const diagram = convertDiagram(props.gqlDiagram, nodeConverters, diagramDescription);
      props.setNodes((nodes) => {
        const ns = filterNodes(diagram.nodes || nodes, filters);
        setInternalNodes(ns);
        return ns;
      });
      props.setEdges((edges) => filterEdges(diagram.edges || edges, filters));
    },
    [filters]
  );

  return [callbackSetNode, callbackSetEdge, internalNodes];
};

function filterNodes(nodes: Node<NodeData>[], filters: Map<string, Filter>) {
  const nodesClone = structuredClone(nodes);
  return Array.from(filters.values()).reduce((computedNodes, filter) => filter.applyOnNodes(computedNodes), nodesClone);
}

function filterEdges(edges: Edge<EdgeData>[], filters: Map<string, Filter>) {
  const edgesClone = structuredClone(edges);
  return Array.from(filters.values()).reduce((computedEdges, filter) => filter.applyOnEdges(computedEdges), edgesClone);
}
