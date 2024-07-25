import {
  GQLDefaultModifier,
  GQLIconLabelNodeStyleDescription,
  GQLImageNodeStyleDescription,
  GQLModifier,
  GQLNodeStyleDescription,
  GQLRectangularNodeStyleDescription,
  GQLStyleModifier,
  GQLVisibilityModifier,
  isDefaultModifier,
  isStyleModifier,
  isVisibilityModifier,
} from '../../graphql/query/InteractivityGraphQL.types';
import {
  GQLDiagram,
  GQLDiagramDescription,
  GQLNode,
  GQLNodeStyle,
  INodeConverter,
  NodeData,
} from '@eclipse-sirius/sirius-components-diagrams';
import { convertDiagram } from '@eclipse-sirius/sirius-components-diagrams';
import {
  GQLIconLabelNodeStyle,
  GQLImageNodeStyle,
  GQLRectangularNodeStyle,
} from '@eclipse-sirius/sirius-components-diagrams';
import { Node } from 'reactflow';

export let gqlnodes: GQLNode<any>[];
export let nodeConverterContributions: INodeConverter[];
export let diagramDescription: GQLDiagramDescription;
export let gqldiagram: GQLDiagram;

export function setModifierParms(
  inodeConverterContributions: INodeConverter[],
  idiagramDescription: GQLDiagramDescription,
  igqldiagram: GQLDiagram
) {
  gqlnodes = igqldiagram.nodes;
  nodeConverterContributions = inodeConverterContributions;
  diagramDescription = idiagramDescription;
  gqldiagram = igqldiagram;
}

export function applyModifier(modifier: GQLModifier, nodes: Node<NodeData>[]) {
  if (isVisibilityModifier(modifier)) {
    applyVisibilityModifier(modifier, nodes);
  } else if (isStyleModifier(modifier)) {
    applyStyleModifier(modifier, nodes);
  } else if (isDefaultModifier(modifier)) {
    applyDefaultModifier(modifier, nodes);
  }
}

function applyDefaultModifier(modifier: GQLDefaultModifier, nodes: Node<NodeData>[]) {
  applyVisibilityModifier(modifier as any as GQLVisibilityModifier, nodes);
  if (!modifier.hide) {
    applyStyleModifier(modifier as any as GQLStyleModifier, nodes);
  }
}

function applyVisibilityModifier(modifier: GQLVisibilityModifier, nodes: Node<NodeData>[]) {
  console.log('Apply visibility modifier');
  nodes.forEach((node) => (node.hidden = modifier.hide));
}

function applyStyleModifier(modifier: GQLStyleModifier, nodes: Node<NodeData>[]) {
  if (nodeConverterContributions && diagramDescription && gqldiagram) {
    for (const [_, node] of nodes.entries()) {
      const gqlnode = gqlnodes.find((n) => n.id === node.id)!;
      const diagram: GQLDiagram = {
        ...gqldiagram,
        edges: [],
        nodes: [
          {
            ...gqlnode,
            style: convertNodeStyle(modifier.style)!,
          },
        ],
      };
      node.data.style = convertDiagram(diagram, nodeConverterContributions, diagramDescription).nodes[0]!.data.style;
      console.log(convertDiagram(diagram, nodeConverterContributions, diagramDescription).nodes[0]!);
    }
  }
}

function convertNodeStyle(style: GQLNodeStyleDescription): GQLNodeStyle | undefined {
  if (style.__typename === 'RectangularNodeStyleDescription') {
    return convertRectangularNodeStyle(style as GQLRectangularNodeStyleDescription);
  } else if (style.__typename === 'ImageNodeStyleDescription') {
    return convertImageNodeStyle(style as GQLImageNodeStyleDescription);
  } else if (style.__typename === 'IconLabelNodeStyleDescription') {
    return convertIconLabelNodeStyleDescription(style as GQLIconLabelNodeStyleDescription);
  }
  return undefined;
}

function convertRectangularNodeStyle(style: GQLRectangularNodeStyleDescription): GQLRectangularNodeStyle {
  return {
    __typename: 'RectangularNodeStyle',
    borderColor: style.borderColor.value,
    borderSize: style.borderSize.toString(),
    borderRadius: style.borderRadius,
    background: style.background.value,
    borderStyle: capitalizeWord(style.borderLineStyle),
  };
}

function convertImageNodeStyle(style: GQLImageNodeStyleDescription): GQLImageNodeStyle {
  console.log(window.location.hostname + ':8080/api/images/' + style.shape);
  return {
    __typename: 'ImageNodeStyle',
    borderColor: style.borderColor.value,
    borderSize: style.borderColor.value,
    borderRadius: style.borderRadius,
    imageURL: window.location.hostname + ':8080/api/images/' + style.shape,
    borderStyle: capitalizeWord(style.borderLineStyle),
    positionDependentRotation: style.positionDependentRotation,
  };
}

function convertIconLabelNodeStyleDescription(style: GQLIconLabelNodeStyleDescription): GQLIconLabelNodeStyle {
  style.__typename;
  return {
    __typename: 'IconLabelNodeStyle',
    background: style.background.value,
  };
}

93;

function capitalizeWord(word: string) {
  if (!word) return word;
  return word[0]!.toUpperCase() + word.substr(1).toLowerCase();
}
