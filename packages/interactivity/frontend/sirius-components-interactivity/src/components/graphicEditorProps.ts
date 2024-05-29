import { Diagram, useStoreValue } from '@eclipse-sirius/sirius-components-diagrams';
import { EventObserver } from '../hook/EventDispatcher';
import { DOMEvents } from '../hook/useInteractivity';

export type GraphicEditorProps = DOMEvents &
  Partial<useStoreValue> & {
    onZoom: EventObserver<(zoom: number) => void>;
    representationId: string;
    editingContextId: string;
    zoomMin: number;
    zoomMax: number;
    diagram: Diagram;
  };
