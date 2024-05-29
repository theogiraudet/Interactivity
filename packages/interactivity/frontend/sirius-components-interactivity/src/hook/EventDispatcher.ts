export interface EventObserver<T extends (...args: any) => any> {
  update(...args: Parameters<T>): void;
  listen(fun: (...args: Parameters<T>) => void): void;
}

export class EventManager<T extends (...args: any) => any> implements EventObserver<T> {
  readonly listeners: ((...args: Parameters<T>) => void)[] = [];

  listen(fun: (...args: Parameters<T>) => void) {
    this.listeners.push(fun);
  }

  update(...args: Parameters<T>) {
    this.listeners.forEach((listener) => listener(...args));
  }
}
