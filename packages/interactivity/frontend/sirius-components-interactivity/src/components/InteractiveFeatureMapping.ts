import {
  GQLDynamicFilter,
  GQLInteractiveFeature,
  GQLInteractivity,
  GQLSemanticSearch,
  GQLSemanticZoom,
} from '../graphql/query/InteractivityGraphQL.types';
import { GraphicEditorProps } from './graphicEditorProps';
import { SemanticZoom } from './semantic_zoom/SemanticZoom';
import { DynamicFilter } from './dynamic_filter/DynamicFilter';
import { SemanticSearch } from './semantic_search/SemanticSearch';

export type InteractiveFeatureProps<T extends GQLInteractiveFeature> = GraphicEditorProps & {
  value: T;
  interactivity: GQLInteractivity;
};

export type JsxInteractiveFeature<T extends GQLInteractiveFeature> = (
  props: InteractiveFeatureProps<T>
) => JSX.Element | null;

type InteractiveFeatureMapping = {
  SemanticZoom: JsxInteractiveFeature<GQLSemanticZoom>;
  DynamicFilter: JsxInteractiveFeature<GQLDynamicFilter>;
  SemanticSearch: JsxInteractiveFeature<GQLSemanticSearch>;
};

const interactiveFeatureMapping: InteractiveFeatureMapping = {
  SemanticZoom: SemanticZoom,
  DynamicFilter: DynamicFilter,
  SemanticSearch: SemanticSearch,
};

export function getJsx<T extends GQLInteractiveFeature>(props: InteractiveFeatureProps<T>, key: number): JSX.Element {
  const featureMapping = interactiveFeatureMapping[props.value.__typename];
  return featureMapping !== undefined ? featureMapping({ ...props }, key) : null;
}
