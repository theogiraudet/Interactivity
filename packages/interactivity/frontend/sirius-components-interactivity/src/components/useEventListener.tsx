import { DependencyList } from 'react';
import { useCustomEventListener } from 'react-custom-events';

export function useEventListener<T>(
  eventName: string,
  eventHandler: (data: T) => void,
  checkType: (v: any) => v is T,
  canHandle: (v: T) => boolean,
  deps?: DependencyList
) {
  useCustomEventListener<any>(
    eventName,
    (data: any) => {
      if (checkType(data) && canHandle(data)) {
        eventHandler(data);
      }
    },
    deps
  );
}
