import { GQLSemanticZoom } from '../../graphql/query/InteractivityGraphQL.types';
import { LevelOfDetail } from './LevelOfDetails';
import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import { NoLevelOfDetail } from './NoLevelOfDetails';

export const SemanticZoom = (props: InteractiveFeatureProps<GQLSemanticZoom>) => {
  return (
    <>
      <NoLevelOfDetail {...props} />
      {props.value.levels.map((level) => (
        <LevelOfDetail {...props} value={level} />
      ))}
    </>
  );
};
