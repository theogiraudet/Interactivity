import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import { GQLDynamicFilter } from '../../graphql/query/InteractivityGraphQL.types';
import { emitCustomEvent, useCustomEventListener } from 'react-custom-events';
import { GQLSingleClickOnDiagramElementTool } from '@eclipse-sirius/sirius-components-diagrams/dist/renderer/palette/Palette.types';
import { DynFilter } from './DynFilter';
import { Filter } from '../filters/Filter';

export const DynamicFilter = (props: InteractiveFeatureProps<GQLDynamicFilter>) => {
  useCustomEventListener('dynamic-filter', (data: GQLSingleClickOnDiagramElementTool) => {
    const filter: Filter = new DynFilter(
      data.selectionDescriptionId,
      props.value.filters.find((value) => value.id === data.selectionDescriptionId.split('|')[0])!.reference,
      data.selectionDescriptionId.split('|')[1]!
    );
    emitCustomEvent('set-filter', filter);
  });

  return null;
};
