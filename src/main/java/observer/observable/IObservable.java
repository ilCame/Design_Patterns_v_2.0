package observer.observable;

import observer.observers.IObserver;

public interface IObservable {
    void add(IObserver observer);
    void remove (IObserver observer);
    void notifyObserver();
    void notifyObservers();
}
