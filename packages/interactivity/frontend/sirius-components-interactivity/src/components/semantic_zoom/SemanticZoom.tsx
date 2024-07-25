import {
  GQLComputeAffectedElementsPayload,
  GQLComputeAffectedElementsSuccessPayload,
  GQLSemanticZoom,
} from '../../graphql/query/InteractivityGraphQL.types';
import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import { useEffect, useState } from 'react';
import { SemZoomFilter } from './SemZoomFilter';
import { emitCustomEvent } from 'react-custom-events';
import { FilterState } from '../../hook/useInteractivityProxy';
import { computeAffectedElementsQuery } from '../../graphql/query/computeAffectedElements';
import { OperationVariables, QueryOptions, useLazyQuery } from '@apollo/client';

const zoomNormalizer = (zoom: number, min: number, max: number) => (zoom - min) / (max - min);
const maxSpecifiedZoom = 200;
const minSpecifiedZoom = 0;

const queryParams = (
  editingContextId: string,
  representationId: string,
  ids: string[]
): QueryOptions<OperationVariables, GQLComputeAffectedElementsPayload> => ({
  query: computeAffectedElementsQuery,
  fetchPolicy: 'no-cache',
  variables: {
    input: {
      id: crypto.randomUUID(),
      editingContextId: editingContextId,
      representationId: representationId,
      containerIds: ids,
    },
  },
});

export const SemanticZoom = (props: InteractiveFeatureProps<GQLSemanticZoom>) => {
  const [affectedNodes, setAffectedNodes] = useState<Map<string, string[]>>(new Map());
  const [query] = useLazyQuery(computeAffectedElementsQuery);

  useEffect(() => {
    query(
      queryParams(
        props.editingContextId,
        props.representationId,
        props.interactivity.features
          .filter((feat) => feat.__typename === 'SemanticZoom')
          .flatMap((semanticZoom) => (semanticZoom as GQLSemanticZoom).levels)
          .flatMap((level) => level.filter)
          .flatMap((filter) => filter.modifiers)
          .map((mod) => mod.id)
      )
    ).then((data) => {
      setAffectedNodes(parseQuery(data)!);
    });
  }, [props.interactivity.filters, props.diagram.nodes.length]);

  useEffect(() => {
    props.onZoom.listen('semantic-zoom', (zoom) => {
      const filters: FilterState[] = [];
      for (const level of props.value.levels) {
        const newZoom = zoomNormalizer(Math.log(zoom), Math.log(props.zoomMin), Math.log(props.zoomMax));
        const specifiedZoomMin = zoomNormalizer(level.min, minSpecifiedZoom, maxSpecifiedZoom);
        const specifiedZoomMax = zoomNormalizer(level.max, minSpecifiedZoom, maxSpecifiedZoom);
        if (newZoom >= specifiedZoomMin && newZoom < specifiedZoomMax) {
          filters.push({
            filter: new SemZoomFilter(level.id, level.filter, structuredClone(affectedNodes)),
            shouldApply: true,
          });
        } else {
          filters.push({
            filter: new SemZoomFilter(level.id, level.filter, structuredClone(affectedNodes)),
            shouldApply: false,
          });
        }
      }
      if (filters.length > 0) {
        emitCustomEvent('set-filter', filters);
      }
    });
  }, [affectedNodes]);

  return null;
};

export function parseQuery(data: any): Map<string, string[]> | undefined {
  data = data.data as any;
  if (data.affectedElements.__typename === 'ComputeAffectedElementsSuccessPayload') {
    const payload = data.affectedElements as GQLComputeAffectedElementsSuccessPayload;
    return new Map(payload.affectedElementIds.map((pair) => [pair.id, pair.affectedElementIds]));
  }
  return undefined;
}
