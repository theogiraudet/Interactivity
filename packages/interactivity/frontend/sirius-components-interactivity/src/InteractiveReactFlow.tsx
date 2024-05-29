import { ReactFlowProps, ReactFlow } from 'reactflow';
import React, { useContext, forwardRef } from 'react';
import { useInteractivity } from './hook/useInteractivity';
import {
  Diagram,
  DiagramContext,
  DiagramContextValue,
  useStore as useStoreSW,
} from '@eclipse-sirius/sirius-components-diagrams';

export const InteractiveReactFlow = forwardRef(
  (props: ReactFlowProps & { diagram: Diagram }, ref: React.Ref<HTMLDivElement>) => {
    const { diagramId: representationId, editingContextId } = useContext<DiagramContextValue>(DiagramContext);
    const childrenProps = {
      ...useStoreSW(),
      editingContextId,
      representationId,
      diagram: props.diagram,
      zoomMin: props.minZoom!,
      zoomMax: props.maxZoom!,
    };

    const features = useInteractivity(childrenProps);
    return (
      <>
        {features}
        <ReactFlow {...props} ref={ref} />
      </>
    );
  }
);
