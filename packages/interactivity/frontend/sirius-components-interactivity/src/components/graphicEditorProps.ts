import { Diagram, NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { EventObserver } from '../hook/EventDispatcher';
import { DOMEvents } from '../hook/useInteractivity';
import { Instance } from 'reactflow';

export type GraphicEditorProps = DOMEvents & {
  onZoom: EventObserver<(zoom: number) => void>;
  representationId: string;
  editingContextId: string;
  zoomMin: number;
  zoomMax: number;
  diagram: Diagram;
  getNodes: Instance.GetNodes<NodeData>;
  setNodes: Instance.SetNodes<NodeData>;
};
