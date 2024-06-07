// import { GQLGraphicZoom } from '../graphql/query/InteractivityGraphQL.types';
// import { Handler } from './handlers';
// import { GraphicEditorProps } from '../components/graphicEditorProps';
// import { emitCustomEvent } from 'react-custom-events';
//
// const zoomNormalizer = (zoom: number, min: number, max: number) => (zoom - min) / (max - min);
// const maxSpecifiedZoom = 200;
// const minSpecifiedZoom = 0;
// const map: Map<string, number> = new Map();
//
// export class GraphicZoomHandler implements Handler<GQLGraphicZoom> {
//   handle(value: GQLGraphicZoom, data: GraphicEditorProps): void {
//     for (const level of value.levels) {
//       data.onZoom.listen((zoom) => {
//         const newZoom = zoomNormalizer(Math.log(zoom), Math.log(data.zoomMin), Math.log(data.zoomMax));
//         const specifiedZoom = zoomNormalizer(level.level, minSpecifiedZoom, maxSpecifiedZoom);
//         const oldZoom = map.get(data.representationId) || -1;
//         if (newZoom != oldZoom && newZoom <= specifiedZoom) {
//           map.set(data.representationId, newZoom);
//           for (const action of level.actionsToTrigger) {
//             console.log('Emit ' + action.name);
//             emitCustomEvent(action.name);
//           }
//         } else {
//           emitCustomEvent('reset');
//         }
//       });
//     }
//   }
// }
