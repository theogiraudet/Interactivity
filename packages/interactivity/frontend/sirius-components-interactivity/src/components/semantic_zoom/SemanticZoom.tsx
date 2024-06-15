import { GQLSemanticZoom } from '../../graphql/query/InteractivityGraphQL.types';
import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import { useEffect } from 'react';
import { SemZoomFilter } from './SemZoomFilter';
import { emitCustomEvent } from 'react-custom-events';
import { FilterState } from '../../hook/useFilter';

const zoomNormalizer = (zoom: number, min: number, max: number) => (zoom - min) / (max - min);
const maxSpecifiedZoom = 200;
const minSpecifiedZoom = 0;

export const SemanticZoom = (props: InteractiveFeatureProps<GQLSemanticZoom>) => {
  useEffect(() => {
    props.onZoom.listen((zoom) => {
      const filters: FilterState[] = [];
      for (const level of props.value.levels) {
        const newZoom = zoomNormalizer(Math.log(zoom), Math.log(props.zoomMin), Math.log(props.zoomMax));
        const specifiedZoomMin = zoomNormalizer(level.min, minSpecifiedZoom, maxSpecifiedZoom);
        const specifiedZoomMax = zoomNormalizer(level.max, minSpecifiedZoom, maxSpecifiedZoom);
        if (newZoom >= specifiedZoomMin && newZoom < specifiedZoomMax) {
          filters.push({ filter: new SemZoomFilter(level.id, level.filter), shouldApply: true });
        } else {
          filters.push({ filter: new SemZoomFilter(level.id, level.filter), shouldApply: false });
        }
      }
      emitCustomEvent('set-filter', filters);
    });
  }, []);

  return null;
};
