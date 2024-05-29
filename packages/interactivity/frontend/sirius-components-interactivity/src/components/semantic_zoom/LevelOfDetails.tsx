import {
  GQLComputeAffectedElementsPayload,
  GQLComputeAffectedElementsSuccessPayload,
  GQLLevelOfDetail,
} from '../../graphql/query/InteractivityGraphQL.types';
import { useApolloClient } from '@apollo/client';
import { computeAffectedElementsQuery } from '../../graphql/query/computeAffectedElements';
import { useCustomEventListener } from 'react-custom-events';
import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';

export const LevelOfDetail = (props: InteractiveFeatureProps<GQLLevelOfDetail>) => {
  const client = useApolloClient();

  useCustomEventListener(
    props.value.name,
    () => {
      client
        .query<GQLComputeAffectedElementsPayload>({
          query: computeAffectedElementsQuery,
          fetchPolicy: 'no-cache',
          variables: {
            input: {
              id: crypto.randomUUID(),
              editingContextId: props.editingContextId,
              representationId: props.representationId,
              actionId: props.value.name,
            },
          },
        })
        .then((data) => interpretQuery(data, props));
      console.log('Receive event');
    },
    []
  );
  return null;
};

function interpretQuery(data: any, props: InteractiveFeatureProps<GQLLevelOfDetail>) {
  data = data.data as any;
  if (data.affectedElements.__typename === 'ComputeAffectedElementsSuccessPayload') {
    const payload = data.affectedElements as GQLComputeAffectedElementsSuccessPayload;
    if (props.setNodes && props.getNodes) {
      const nodes = props.getNodes().map((node) => {
        if (payload.affectedElementIds.includes(node.data.targetObjectId)) {
          node.hidden = true;
        }
        return node;
      });
      props.setNodes(nodes);
      console.log('apply semantic zoom');
    }
  }
}
