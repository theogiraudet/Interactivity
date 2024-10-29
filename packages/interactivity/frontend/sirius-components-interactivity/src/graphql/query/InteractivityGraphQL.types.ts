import { GQLMessage } from '@eclipse-sirius/sirius-components-core';
import { GQLDiagramDescription } from '@eclipse-sirius/sirius-components-diagrams';

export interface InteractivityModelQuery {
  interactivity: (input: GQLInteractivityModelInput) => GQLInteractivityModelPayload;
  affectedElements: (input: GQLComputeAffectedNodesInput) => GQLComputeAffectedElementsPayload;
  dynamicFilter: (input: GQLComputeDynamicFilterInput) => GQLComputeDynamicFilterPayload;
  semanticSearch: (input: GQLSemanticSearchInput) => GQLSemanticSearchPayload;
}

export interface InteractivityPayload {
  interactivity: GQLInteractivityModelPayload;
}

export interface GQLInteractivityModelInput {
  id: string;
  editingContextId: string;
  representationId: string;
}

export interface GQLSemanticSearchInput {
  id: string;
  editingContextId: string;
  representationId: string;
  input: string;
}

export interface GQLComputeAffectedNodesInput {
  id: string;
  editingContextId: string;
  representationId: string;
  containerIds: string[];
}

export interface GQLComputeDynamicFilterInput {
  id: string;
  editingContextId: string;
  representationId: string;
  filterId: string;
  focusedElementId: string;
}

export interface GQLSnippetInput {
  id: string;
  editingContextId: string;
  representationId: string;
  snippetId: string;
  focusedElementId: string;
}

export interface GQLSuccessPayload {
  __typename: string;
  id: string;
  message: GQLMessage[];
}

export interface GQLErrorPayload {
  __typename: string;
  messages: GQLMessage[];
}

export interface GQLInteractivityModelSuccessPayload {
  __typename: string;
  id: string;
  interactivity: GQLInteractivity;
}

export interface GQLComputeAffectedElementsSuccessPayload {
  __typename: string;
  id: string;
  affectedElementIds: AffectedElementIdsPair[];
}

export interface AffectedElementIdsPair {
  id: string;
  affectedElementIds: string[];
}

export type GQLComputeAffectedElementsPayload =
  | GQLComputeAffectedElementsSuccessPayload
  | GQLSuccessPayload
  | GQLErrorPayload;
export type GQLInteractivityModelPayload = GQLInteractivityModelSuccessPayload | GQLSuccessPayload | GQLErrorPayload;

export interface GQLComputeDynamicFilterSuccessPayload {
  __typename: string;
  id: string;
  elementIds: GQLSemanticElementModifier[];
  edges: string[];
}

export interface GQLSemanticElementModifier {
  semanticElementId: string;
  modifierId: string;
}

export type GQLSnippetPayload = GQLSnippetSuccessPayload | GQLErrorPayload;

export interface GQLSnippetSuccessPayload {
  __typename: string;
  id: string;
}

export type GQLComputeDynamicFilterPayload = GQLComputeDynamicFilterSuccessPayload | GQLErrorPayload;

export interface GQLSemanticSearchSuccessPayload {
  __typename: string;
  id: string;
  semanticElementIds: string[];
}

export type GQLSemanticSearchPayload = GQLSemanticSearchSuccessPayload | GQLErrorPayload;

export interface Nameable {
  __typename: string;
}

export interface Identifiable {
  id: string;
}

export interface GQLInteractivity extends Nameable {
  domainId: string;
  diagramDefinition: GQLDiagramDescription;
  features: GQLInteractiveFeature[];
  filters: GQLFilterDefinition[];
}

export interface GQLInteractiveFeature extends Nameable {}

export interface GQLSemanticZoom extends GQLInteractiveFeature {
  levels: GQLZoomLevel[];
}

export interface GQLZoomLevel extends Nameable, Identifiable {
  min: number;
  max: number;
  filter: GQLFilterDefinition;
}

export interface GQLFilterDefinition extends Nameable {
  name: string;
  modifiers: GQLScopedModifier[];
}

export interface ElementReference extends GQLModifier, Nameable {}

export interface Path extends ElementReference {
  path: string;
}

export interface GQLModifier extends Nameable, Identifiable {}

export interface GQLScopedModifier extends GQLModifier {
  elements: ElementReference;
}

export interface GQLVisibilityModifier extends GQLScopedModifier {
  hide: boolean;
}

export function isVisibilityModifier(value: any): value is GQLVisibilityModifier {
  return value['__typename'] !== undefined && value.__typename === 'VisibilityModifier';
}

export interface GQLDefaultModifier extends GQLModifier {
  hide: boolean;
  style: GQLNodeStyleDescription;
  color: GQLUserColor[];
}

export function isDefaultModifier(value: any): value is GQLDefaultModifier {
  return value['__typename'] !== undefined && value.__typename === 'DefaultModifier';
}

export interface GQLStyleModifier extends GQLScopedModifier {
  style: GQLNodeStyleDescription;
  color: GQLUserColor[];
}

export function isStyleModifier(value: any): value is GQLStyleModifier {
  return value['__typename'] !== undefined && value.__typename === 'StyleModifier';
}

export interface GQLDynamicFilter extends GQLInteractiveFeature, Identifiable {
  filter: GQLFilterDefinition;
  name: string;
  radius: GQLRadius;
  focus: ElementReference;
  defaultModifier: GQLDefaultModifier;
}

export interface GQLRadius extends Nameable {}

export interface GQLFixedRadius extends GQLRadius {
  value: number;
}

export interface GQLBoundedRadius extends GQLRadius {
  min: number;
  max: number;
}

export interface GQLSemanticSearch extends GQLInteractiveFeature, Identifiable {
  search: string;
}

export interface GQLNodeStyleDescription extends Nameable {
  borderColor: GQLUserColor;
  borderRadius: number;
  borderSize: number;
  borderLineStyle: string;
}

export interface GQLRectangularNodeStyleDescription extends GQLNodeStyleDescription {
  background: GQLUserColor;
}

export interface GQLImageNodeStyleDescription extends GQLNodeStyleDescription {
  shape: string;
  positionDependentRotation: boolean;
}

export interface GQLIconLabelNodeStyleDescription extends GQLNodeStyleDescription {
  background: GQLUserColor;
}

export interface GQLUserColor {
  name: string;
  value: string;
}

export interface GQLSnippet extends GQLInteractiveFeature, Identifiable {
  name: string;
}
