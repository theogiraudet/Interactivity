export interface EventObserver<T extends (...args: any) => any> {
  update(...args: Parameters<T>): ReturnType<T>[];
  listen(fun: (...args: Parameters<T>) => ReturnType<T>): void;
}

export class EventManager<T extends (...args: any) => any> implements EventObserver<T> {
  readonly listeners: ((...args: Parameters<T>) => ReturnType<T>)[] = [];

  listen(fun: (...args: Parameters<T>) => ReturnType<T>) {
    this.listeners.push(fun);
  }

  update(...args: Parameters<T>): ReturnType<T>[] {
    return this.listeners.map((listener) => listener(...args));
  }
}
