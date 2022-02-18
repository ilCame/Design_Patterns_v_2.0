package observer.observers.impl;

import observer.observable.impl.WeatherStation;
import observer.observers.IObserver;

public class ObserverImpl implements IObserver {
    WeatherStation weatherStation;
    int result;

    public ObserverImpl(WeatherStation observable) {
        this.weatherStation = observable;
    }

    @Override
    public void Update() {
        result = this.weatherStation.getTemperature();
    }

    @Override
    public void Update(Object observable) throws IncompatibleClassChangeError{
        if(observable instanceof WeatherStation){
            result = ((WeatherStation) observable).getTemperature();
        } else {
            throw new IncompatibleClassChangeError("the object is not a weather station");
        }
    }
}
