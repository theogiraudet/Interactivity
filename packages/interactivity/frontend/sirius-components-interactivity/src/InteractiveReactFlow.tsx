import { ReactFlowProps, ReactFlow, useReactFlow } from 'reactflow';
import React, { useContext, forwardRef } from 'react';
import { useInteractivity } from './hook/useInteractivity';
import { Diagram, DiagramContext, DiagramContextValue, NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { EdgeData } from '@eclipse-sirius/sirius-components-diagrams/dist/renderer/DiagramRenderer.types';
import { Interactivity } from './components/Interactivity';

export const InteractiveReactFlow = forwardRef(
  (props: ReactFlowProps & { diagram: Diagram }, ref: React.Ref<HTMLDivElement>) => {
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
    return (
      <>
        {model && <Interactivity interactivity={model} {...childrenProps} />}
        <ReactFlow {...props} ref={ref} />
      </>
    );
  }
);
