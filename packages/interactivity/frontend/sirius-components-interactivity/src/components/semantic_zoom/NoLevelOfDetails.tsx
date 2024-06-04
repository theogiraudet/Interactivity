import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import { GQLLevelOfDetail } from '../../graphql/query/InteractivityGraphQL.types';
import { useCustomEventListener } from 'react-custom-events';

export const NoLevelOfDetail = (props: Omit<InteractiveFeatureProps<GQLLevelOfDetail>, 'value'>) => {
  useCustomEventListener(
    'reset',
    () => {
      // if (props.getNodes() != props.diagram.nodes) {
      console.log('reset');
      props.setNodes(props.diagram.nodes);
      // }
    },
    []
  );

  return null;
};
