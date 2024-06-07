import { Diagram, NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { useLazyQuery } from '@apollo/client';
import { getInteractivityModelQuery } from '../graphql/query/getInteractivityModel';
import { GQLInteractivityModelSuccessPayload, InteractivityPayload } from '../graphql/query/InteractivityGraphQL.types';
import React, { memo, useEffect, useMemo, useState } from 'react';
import { Instance, useStore } from 'reactflow';
import { EventManager } from './EventDispatcher';
import { getJsx } from '../components/InteractiveFeatureMapping';

export type DOMEvents = Omit<React.DOMAttributes<HTMLDivElement>, 'children' | 'dangerouslySetInnerHTML'>;

export type UseInteractivityValue = DOMEvents & {
  representationId: string;
  editingContextId: string;
  zoomMin: number;
  zoomMax: number;
  diagram: Diagram;
  getNodes: Instance.GetNodes<NodeData>;
  setNodes: Instance.SetNodes<NodeData>;
};

const EPSILON = 0.0001;

export const useInteractivityOld = (props: UseInteractivityValue) => {
  const zoomEvent = useMemo(() => new EventManager<(zoomLevel: number) => void>(), []);
  // const [interactions, setInteractions] = useState<GQLInteraction[]>([])
  const [elements, setElements] = useState<(() => JSX.Element)[]>([]);
  const [oldZoom, setZoom] = useState<number>(0);
  const zoom = useStore((state) => state.transform[2]);

  if (Math.abs(oldZoom - zoom) > EPSILON) {
    zoomEvent.update(zoom);
    setZoom(zoom);
  }

  const [load] = useLazyQuery<InteractivityPayload>(getInteractivityModelQuery, {
    onCompleted: (data) => {
      if (data.interactivity.__typename === 'InteractivityModelSuccessPayload') {
        const payload = data.interactivity as GQLInteractivityModelSuccessPayload;
        // for (const interaction of payload.interactivity.diagramEditors[0]?.interactions || []) {
        //   getHandler(interaction)?.handle(interaction, { ...props, onZoom: zoomEvent });
        // }

        const features = payload.interactivity.features;
        console.log('Set elements');
        setElements(features!.map((feature, index) => getJsx({ ...props, value: feature, onZoom: zoomEvent }, index)));
      }
    },
    fetchPolicy: 'cache-first',
  });

  useEffect(() => {
    load({
      variables: {
        input: {
          id: crypto.randomUUID(),
          editingContextId: props.editingContextId,
          representationId: props.representationId,
        },
        refetchOnWindowFocus: false,
      },
    });
  }, []);

  return elements;
};

export default useInteractivity;

// function flatMap<T, U>(values: T[], fun: (param: T) => U[]): U[] {
//   return values.map((v) => fun(v)).reduce((acc, val) => acc.concat(val), []);
// }

// @ts-ignore
// function iterateOverValue<T>(value: any, condition: (obj: any) => obj is T): T[] {
//   if (Array.isArray(value)) {
//     return flatMap(value, (v) => iterateOverValue(v, condition));
//   } else if (typeof value === 'object' && condition(value)) {
//     return [value];
//   } else if (typeof value === 'object') {
//     return flatMap(Object.values(value), (v) => iterateOverValue(v, condition));
//   } else {
//     return [];
//   }
// }
