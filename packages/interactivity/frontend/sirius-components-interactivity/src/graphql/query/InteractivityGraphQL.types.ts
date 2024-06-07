import { GQLMessage } from '@eclipse-sirius/sirius-components-core';
import { GQLDiagramDescription, GQLNodeStyle } from '@eclipse-sirius/sirius-components-diagrams';

export interface InteractivityModelQuery {
  interactivity: (input: GQLInteractivityModelInput) => GQLInteractivityModelPayload;
  affectedElements: (input: GQLComputeAffectedNodesInput) => GQLComputeAffectedElementsPayload;
}

export interface InteractivityPayload {
  interactivity: GQLInteractivityModelPayload;
}

export interface GQLInteractivityModelInput {
  id: string;
  editingContextId: string;
  representationId: string;
}

export interface GQLComputeAffectedNodesInput {
  id: string;
  editingContextId: string;
  representationId: string;
  containerIds: string[];
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

export interface GQLZoomLevel extends Nameable {
  min: number;
  max: number;
  filter: GQLFilterDefinition;
}

export interface GQLFilterDefinition extends Nameable {
  name: string;
  modifiers: GQLModifier[];
}

export interface GQLModifier extends Nameable, Identifiable {
  path: string;
}

export interface GQLVisibilityModifier extends GQLModifier {
  hide: boolean;
}

export function isVisibilityModifier(value: any): value is GQLVisibilityModifier {
  return value['__typename'] !== undefined && value.__typename === 'VisibilityModifier';
}

export interface GQLStyleModifier extends GQLModifier {
  style: GQLNodeStyle;
}

export function isStyleModifier(value: any): value is GQLStyleModifier {
  return value['__typename'] !== undefined && value.__typename === 'StyleModifier';
}

export interface GQLDynamicFilter extends GQLInteractiveFeature {
  filters: GQLFilter[];
  radius: GQLRadius;
}

export interface GQLFilter extends Nameable, Identifiable {
  reference: GQLFilterDefinition;
  name: string;
  focus: string;
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
