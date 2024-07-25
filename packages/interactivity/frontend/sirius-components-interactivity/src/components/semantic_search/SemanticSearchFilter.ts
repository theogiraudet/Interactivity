import { EdgeData, NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Edge, Node } from 'reactflow';
import { Filter } from '../filters/Filter';

export class SemanticSearchFilter implements Filter {
  readonly id: string;
  readonly elementIds: string[];

  constructor(id: string, elementIds: string[]) {
    this.id = id;
    this.elementIds = elementIds;
  }

  applyOnNodes(nodes: Node<NodeData>[]): Node<NodeData>[] {
    console.log('Applying semantic search filter');
    const result: Node<NodeData>[] = [];
    for (const node of nodes) {
      if (this.elementIds.includes(node.data.targetObjectId)) {
        console.log('Applying find target:');
        console.log(structuredClone(node));

        if (node.type === 'iconLabelNode' && node.data.insideLabel) {
          node.data.insideLabel.style = {
            ...node.data.insideLabel.style,
            color: '#FF0000',
          };
        } else if (node.type === 'listNode' || node.type === 'imageNode' || node.type === 'rectangleNode') {
          node.data.style = {
            ...node.data.style,
            borderBottomColor: '#FF0000',
            borderTopColor: '#FF0000',
            borderRightColor: '#FF0000',
            borderLeftColor: '#FF0000',
          };
        }
      }
      result.push(node);
    }
    return result;
  }

  applyOnEdges(edges: Edge<EdgeData>[]): Edge<EdgeData>[] {
    return edges;
  }
}
