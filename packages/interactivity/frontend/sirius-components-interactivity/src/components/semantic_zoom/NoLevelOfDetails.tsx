import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import { GQLLevelOfDetail } from '../../graphql/query/InteractivityGraphQL.types';
import { useCustomEventListener } from 'react-custom-events';

export const NoLevelOfDetail = (props: Omit<InteractiveFeatureProps<GQLLevelOfDetail>, 'value'>) => {
  useCustomEventListener(
    'reset',
    () => {
      if (props.setNodes && props.getNodes && props.getNodes() != props.diagram.nodes) {
        props.setNodes(props.diagram.nodes);
      } else if (props.setNodes && props.getNodes) {
        console.log(props.getNodes() != props.diagram.nodes);
      }
    },
    []
  );

  return null;
};
