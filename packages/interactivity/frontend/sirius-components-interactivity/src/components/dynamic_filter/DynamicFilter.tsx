import { InteractiveFeatureProps } from '../InteractiveFeatureMapping';
import { GQLDynamicFilter } from '../../graphql/query/InteractivityGraphQL.types';
import { emitCustomEvent, useCustomEventListener } from 'react-custom-events';
import { GQLSingleClickOnDiagramElementTool } from '@eclipse-sirius/sirius-components-diagrams/dist/renderer/palette/Palette.types';
import { DynFilter } from './DynFilter';
import { Filter } from '../Filter';

export const DynamicFilter = (props: InteractiveFeatureProps<GQLDynamicFilter>) => {
  // const map = useMemo(() => {
  //   const map: Map<string, EventObserver<(nodes: Node<NodeData, string>[]) => Promise<void>>> = new Map();
  //   for (const filter of props.value.filters) {
  //     map.set(filter.id, new EventManager<(nodes: Node<NodeData, string>[]) => Promise<void>>());
  //   }
  //   return map;
  // }, []);

  useCustomEventListener('dynamic-filter', (data: GQLSingleClickOnDiagramElementTool) => {
    const filter: Filter = new DynFilter(
      data.selectionDescriptionId,
      props.value.filters.find((value) => value.id === data.selectionDescriptionId)!.reference
    );
    emitCustomEvent('set-filter', filter);
    // const filter = appliedFilters.get(data.selectionDescriptionId);
    // if (filter) {
    //   appliedFilters.delete(filter.id);
    //   setAppliedFilters(appliedFilters);
    // } else {
    //   const filter = props.value.filters.find((filter) => filter.id == data.selectionDescriptionId);
    //   console.log(filter);
    //   if (filter) {
    //     appliedFilters.set(filter.id, filter);
    //     setAppliedFilters(appliedFilters);
    //   }
    // }
  });

  return null;
  // return (
  //   <>
  //     {[...appliedFilters.values()].map((filter, index) => (
  //       <FilterMemo
  //         {...props}
  //         filter={filter}
  //         event={map.get(filter.id)!}
  //         setNodes={props.setNodes}
  //         nodes={props.diagram.nodes}
  //         key={index}
  //       />
  //     ))}
  //   </>
  // );
};
