import { EdgeData, NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Edge, Node } from 'reactflow';

export interface Filter {
  readonly id: string;

  applyOnNodes(nodes: Node<NodeData>[]): Node<NodeData>[];
  applyOnEdges(edges: Edge<EdgeData>[]): Edge<EdgeData>[];
}
