import { GQLMessage } from '@eclipse-sirius/sirius-components-core';
import { GQLDiagramDescription } from '@eclipse-sirius/sirius-components-diagrams';

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
  actionId: string;
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

export interface GQLInteractivity extends Nameable {
  domainId: string;
  diagramEditors: GQLDiagramEditor[];
}

export interface GQLDiagramEditor extends Nameable {
  interactions: GQLInteraction[];
  interactiveFeatures: GQLInteractiveFeature[];
  diagramDefinition: GQLDiagramDescription;
}

export interface GQLInteraction extends Nameable {}

export interface GQLInteractiveFeature extends Nameable {}

export interface GQLCommand extends Nameable {
  __command: undefined;
  actionsToTrigger: GQLAction[];
}

export interface GQLAction extends Nameable {
  __action: undefined;
  __typename: string;
  name: string;
}

export function isGQLCommand(obj: any): obj is GQLCommand {
  return typeof obj === 'object' && obj.hasOwnProperty('__command');
}

export function isGQLAction(obj: any): obj is GQLAction {
  return typeof obj === 'object' && obj.hasOwnProperty('__action');
}

export interface GQLGraphicZoom extends GQLInteraction {
  levels: GQLZoomLevel[];
}

export interface GQLZoomLevel extends GQLCommand {
  actionsToTrigger: GQLAction[];
  level: number;
}

export interface GQLSemanticZoom extends GQLInteractiveFeature {
  levels: GQLLevelOfDetail[];
}

export interface GQLLevelOfDetail extends GQLAction {}
