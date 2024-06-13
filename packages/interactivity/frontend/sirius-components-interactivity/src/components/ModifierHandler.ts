import {
  GQLModifier,
  GQLVisibilityModifier,
  isStyleModifier,
  isVisibilityModifier,
} from '../graphql/query/InteractivityGraphQL.types';
import { NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { Node } from 'reactflow';

export function applyModifier(
  modifier: GQLModifier,
  nodes: Node<NodeData>[] /*, setNodes: ((nodes: Node<NodeData>[]) => void)*/
) {
  if (isVisibilityModifier(modifier)) {
    applyVisibilityModifier(modifier, nodes /*, setNodes*/);
  } else if (isStyleModifier(modifier)) {
  }
}

function applyVisibilityModifier(
  modifier: GQLVisibilityModifier,
  nodes: Node<NodeData>[] /*, setNodes: ((nodes: Node<NodeData>[]) => void)*/
) {
  console.log('Apply visibility modifier ' + modifier.hide);
  console.log(nodes);
  nodes.forEach((node) => (node.hidden = modifier.hide));
}
