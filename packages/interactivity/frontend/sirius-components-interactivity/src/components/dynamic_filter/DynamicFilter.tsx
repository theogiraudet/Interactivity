import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import {
  GQLComputeDynamicFilterPayload,
  GQLComputeDynamicFilterSuccessPayload,
  GQLDynamicFilter,
} from '../../graphql/query/InteractivityGraphQL.types';
import { computeAffectedElementsQuery } from '../../graphql/query/computeAffectedElements';
import { OperationVariables, QueryOptions, useLazyQuery } from '@apollo/client';
import { useEffect, useState } from 'react';
import { GQLSingleClickOnDiagramElementTool } from '@eclipse-sirius/sirius-components-diagrams';
import { emitCustomEvent, useCustomEventListener } from 'react-custom-events';
import { DynFilter } from './DynFilter';
import { computeDynamicFilterQuery } from '../../graphql/query/computeDynamicFilter';

const queryParams = (
  editingContextId: string,
  representationId: string,
  focusedId: string,
  filterId: string
): QueryOptions<OperationVariables, GQLComputeDynamicFilterPayload> => ({
  query: computeDynamicFilterQuery,
  fetchPolicy: 'no-cache',
  variables: {
    input: {
      id: crypto.randomUUID(),
      editingContextId: editingContextId,
      representationId: representationId,
      filterId: filterId,
      focusedElementId: focusedId,
    },
  },
});

export const DynamicFilter = (props: InteractiveFeatureProps<GQLDynamicFilter>) => {
  const [query] = useLazyQuery(computeAffectedElementsQuery);
  const [activeFilter, setActiveFilter] = useState<Map<string, DynFilter>>(new Map());

  useEffect(() => {}, [props.interactivity.filters, props.diagram.nodes.length]);

  useCustomEventListener(
    'dynamic-filter-' + props.value.id,
    (data: GQLSingleClickOnDiagramElementTool) => {
      let filter = activeFilter.get(data.selectionDescriptionId);
      if (filter) {
        setActiveFilter((prevState) => {
          prevState.delete(data.selectionDescriptionId);
          return prevState;
        });
        emitCustomEvent('set-filter', filter);
      } else {
        const start = performance.now();
        query(
          queryParams(
            props.editingContextId,
            props.representationId,
            data.selectionDescriptionId.split('|')[1]!,
            data.selectionDescriptionId.split('|')[0]!
          )
        ).then((result) => {
          const dat = result.data as any;
          const end = performance.now();
          const responseTime = end - start;
          console.log(`[Monitoring] Dynamic filter response time: ${responseTime} ms`);
          if (dat.dynamicFilter.__typename === 'ComputeDynamicFilterSuccessPayload') {
            const payload = dat.dynamicFilter as GQLComputeDynamicFilterSuccessPayload;
            filter = new DynFilter(data.selectionDescriptionId, props.value.filter, props.value!, payload);
            setActiveFilter((prevState) => {
              prevState.set(data.selectionDescriptionId, filter!);
              return prevState;
            });
            emitCustomEvent('set-filter', filter);
          }
        });
      }
    },
    [activeFilter, props.interactivity.filters, props.diagram.nodes.length, props.diagram.edges.length]
  );

  return null;
};
