export interface EventObserver<T extends (...args: any) => any> {
  update(...args: Parameters<T>): ReturnType<T>[];
  listen(id: string, fun: (...args: Parameters<T>) => ReturnType<T>): void;
}

export class EventManager<T extends (...args: any) => any> implements EventObserver<T> {
  readonly listeners: Map<string, (...args: Parameters<T>) => ReturnType<T>> = new Map();

  listen(id: string, fun: (...args: Parameters<T>) => ReturnType<T>) {
    this.listeners.set(id, fun);
  }

  update(...args: Parameters<T>): ReturnType<T>[] {
    return [...this.listeners.values()].map((listener) => listener(...args));
  }
}
