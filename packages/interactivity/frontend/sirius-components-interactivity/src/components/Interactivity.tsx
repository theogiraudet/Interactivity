import { GQLInteractivity } from '../graphql/query/InteractivityGraphQL.types';
import { getJsx } from './InteractiveFeatureMapping';
import { EventManager } from '../hook/EventDispatcher';
import { useMemo, useState } from 'react';
import { Instance, useStore } from 'reactflow';
import { Diagram, NodeData } from '@eclipse-sirius/sirius-components-diagrams';

type InteractivityProps = {
  interactivity: GQLInteractivity;
  representationId: string;
  editingContextId: string;
  zoomMin: number;
  zoomMax: number;
  diagram: Diagram;
  getNodes: Instance.GetNodes<NodeData>;
  setNodes: Instance.SetNodes<NodeData>;
};

const EPSILON = 0.0001;

export const Interactivity = (props: InteractivityProps) => {
  const zoomEvent = useMemo(() => new EventManager<(zoomLevel: number) => void>(), []);
  // const [interactions, setInteractions] = useState<GQLInteraction[]>([])
  const [oldZoom, setZoom] = useState<number>(0);
  const zoom = useStore((state) => state.transform[2]);

  if (Math.abs(oldZoom - zoom) > EPSILON) {
    zoomEvent.update(zoom);
    setZoom(zoom);
  }

  return (
    <>{props.interactivity.features.map((feature, i) => getJsx({ ...props, value: feature, onZoom: zoomEvent }, i))}</>
  );
};
