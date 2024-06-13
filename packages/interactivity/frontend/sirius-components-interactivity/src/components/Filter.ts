import { NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Node } from 'reactflow';

export interface Filter {
  readonly id: string;

  apply(nodes: Node<NodeData>[], affectedNodes: Map<string, string[]>): Node<NodeData>[];
}
