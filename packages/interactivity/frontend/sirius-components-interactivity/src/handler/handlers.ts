import { Nameable } from '../graphql/query/InteractivityGraphQL.types';
import { GraphicEditorProps } from '../components/graphicEditorProps';
import { GraphicZoomHandler } from './GraphicZoomHandler';

export interface Handler<T> {
  handle(value: T, data: GraphicEditorProps): void;
}

type HandlerRegistry = {
  GraphicZoom: GraphicZoomHandler;
};

const registry: HandlerRegistry = {
  GraphicZoom: new GraphicZoomHandler(),
};

export function getHandler<T extends Nameable>(obj: T): Handler<T> | undefined {
  return registry[obj.__typename];
}
