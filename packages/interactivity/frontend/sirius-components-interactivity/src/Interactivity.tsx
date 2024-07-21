import { ReactFlowProps, useReactFlow } from 'reactflow';
import { useContext } from 'react';
import { useInteractivity } from './hook/useInteractivity';
import { Diagram, DiagramContext, DiagramContextValue, NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { EdgeData } from '@eclipse-sirius/sirius-components-diagrams';
import { InteractivityFeatures } from './components/InteractivityFeatures';

export const Interactivity = (props: ReactFlowProps & { diagram: Diagram }) => {
  const { diagramId: representationId, editingContextId } = useContext<DiagramContextValue>(DiagramContext);
  const { getNodes, setNodes } = useReactFlow<NodeData, EdgeData>();
  const childrenProps = {
    getNodes,
    setNodes,
    editingContextId,
    representationId,
    diagram: props.diagram,
    zoomMin: props.minZoom!,
    zoomMax: props.maxZoom!,
  };

  const model = useInteractivity(childrenProps);
  return <>{model && <InteractivityFeatures interactivity={model} {...childrenProps} />}</>;
};
