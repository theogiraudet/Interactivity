import {
  GQLSemanticSearch,
  GQLSemanticSearchPayload,
  GQLSemanticSearchSuccessPayload,
} from '../../graphql/query/InteractivityGraphQL.types';
import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import { OperationVariables, QueryOptions, useLazyQuery } from '@apollo/client';
import { computeSemanticSearchQuery } from '../../graphql/query/computeSemanticSearch';
import { emitCustomEvent, useCustomEventListener } from 'react-custom-events';
import { SemanticSearchFilter } from './SemanticSearchFilter';
import { useEffect, useMemo, useState } from 'react';
import { v4 as uuid } from 'uuid';

const queryParams = (
  editingContextId: string,
  representationId: string,
  input: string
): QueryOptions<OperationVariables, GQLSemanticSearchPayload> => ({
  query: computeSemanticSearchQuery,
  fetchPolicy: 'no-cache',
  variables: {
    input: {
      id: crypto.randomUUID(),
      editingContextId: editingContextId,
      representationId: representationId,
      input: input,
    },
  },
});

export const SemanticSearch = (props: InteractiveFeatureProps<GQLSemanticSearch>) => {
  const [query] = useLazyQuery(computeSemanticSearchQuery);
  const [activeFilter, setActiveFilter] = useState<SemanticSearchFilter | undefined>(undefined);

  useEffect(() => emitCustomEvent('display-semantic-search'), []);
  const id: string = useMemo(uuid, []);

  useCustomEventListener(
    'semantic-search',
    (input: string | undefined) => {
      if (input == undefined) {
        emitCustomEvent('set-filter', {
          filter: activeFilter,
          shouldApply: false,
        });
        setActiveFilter(undefined);
        console.log('Clean!');
      } else {
        query(queryParams(props.editingContextId, props.representationId, input)).then((result) => {
          const dat = result.data as any;
          if (dat.semanticSearch.__typename === 'SemanticSearchSuccessPayload') {
            const payload = dat.semanticSearch as GQLSemanticSearchSuccessPayload;
            const filter = new SemanticSearchFilter(id, payload.semanticElementIds);
            console.log('Set semantic search filter');
            emitCustomEvent('set-filter', { filter, shouldApply: true });
            setActiveFilter(filter);
          }
        });
      }
    },
    [activeFilter, props.interactivity.filters, props.diagram.nodes.length, props.diagram.edges.length]
  );

  return null;
};
