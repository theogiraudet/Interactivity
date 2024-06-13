import { useLazyQuery } from '@apollo/client';
import { getInteractivityModelQuery } from '../graphql/query/getInteractivityModel';
import {
  GQLInteractivity,
  GQLInteractivityModelSuccessPayload,
  InteractivityPayload,
} from '../graphql/query/InteractivityGraphQL.types';
import React, { useEffect, useState } from 'react';
import { emitCustomEvent } from 'react-custom-events';

export type DOMEvents = Omit<React.DOMAttributes<HTMLDivElement>, 'children' | 'dangerouslySetInnerHTML'>;

export type UseInteractivityValue = DOMEvents & {
  representationId: string;
  editingContextId: string;
};

export const useInteractivity = (props: UseInteractivityValue) => {
  const [model, setModel] = useState<GQLInteractivity | undefined>(undefined);

  const [load] = useLazyQuery<InteractivityPayload>(getInteractivityModelQuery, {
    onCompleted: (data) => {
      if (data.interactivity.__typename === 'InteractivityModelSuccessPayload') {
        const payload = data.interactivity as GQLInteractivityModelSuccessPayload;
        setModel(payload.interactivity);
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
    }).then((data) => {
      const dat = data.data as any;
      if (dat.interactivity.__typename === 'InteractivityModelSuccessPayload') {
        const payload = dat.interactivity as GQLInteractivityModelSuccessPayload;
        emitCustomEvent('set-filter-definitions', payload.interactivity.filters);
      }
    });
  }, []);

  return model;
};
