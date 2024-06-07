import { GQLSemanticZoom } from '../../graphql/query/InteractivityGraphQL.types';
import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import { EventManager, EventObserver } from '../../hook/EventDispatcher';
import { useEffect, useMemo } from 'react';
import { Node } from 'reactflow';
import { NodeData } from '@eclipse-sirius/sirius-components-diagrams';
import { LevelOfDetail } from './LevelOfDetails';

const zoomNormalizer = (zoom: number, min: number, max: number) => (zoom - min) / (max - min);
const maxSpecifiedZoom = 200;
const minSpecifiedZoom = 0;

export const SemanticZoom = (props: InteractiveFeatureProps<GQLSemanticZoom>) => {
  const map = useMemo(() => {
    const map: Map<
      number,
      EventObserver<
        (nodes: Node<NodeData, string>[], setNodes: (nodes: Node<NodeData, string>[]) => void) => Promise<void>
      >
    > = new Map();
    for (const [index, _] of props.value.levels.entries()) {
      map.set(
        index,
        new EventManager<
          (nodes: Node<NodeData, string>[], setNodes: (nodes: Node<NodeData, string>[]) => void) => Promise<void>
        >()
      );
    }
    return map;
  }, []);

  useEffect(() => {
    props.onZoom.listen((zoom) => {
      console.log('---');
      let context_nodes = structuredClone(props.diagram.nodes);
      console.log(context_nodes[1]!.hidden);
      const setNodes = (nodes: Node<NodeData, string>[]) => (context_nodes = nodes);
      const promises: Promise<void>[] = [];
      for (const [index, level] of props.value.levels.entries()) {
        const newZoom = zoomNormalizer(Math.log(zoom), Math.log(props.zoomMin), Math.log(props.zoomMax));
        const specifiedZoomMin = zoomNormalizer(level.min, minSpecifiedZoom, maxSpecifiedZoom);
        const specifiedZoomMax = zoomNormalizer(level.max, minSpecifiedZoom, maxSpecifiedZoom);
        if (newZoom >= specifiedZoomMin && newZoom < specifiedZoomMax) {
          console.log('Apply a semantic zoom');
          promises.push(...map.get(index)!.update(context_nodes, setNodes));
        }
      }
      console.log(context_nodes[1]!.hidden);
      Promise.all(promises).then(() => props.setNodes(context_nodes));
    });
  }, []);

  return (
    <>
      {props.value.levels.map((level, index) => (
        <LevelOfDetail
          {...props}
          level={level}
          zoomEvent={map.get(index)!}
          key={index}
        />
      ))}
    </>
  );
};
