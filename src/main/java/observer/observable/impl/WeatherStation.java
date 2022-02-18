package observer.observable.impl;

import observer.observable.IObservable;
import observer.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    public List<IObserver> observers = new ArrayList<>();
    public WeatherStation weatherStation;
    public int temperature;

    public WeatherStation() {
    }

    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver o: this.observers) {
            o.Update();
        }
    }

    @Override
    public void notifyObservers(){
        weatherStation = new WeatherStation();
        for (IObserver o:this.observers) {
            o.Update(weatherStation);
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
