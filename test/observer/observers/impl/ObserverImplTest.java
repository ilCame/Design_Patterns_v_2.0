package observer.observers.impl;

import observer.observable.impl.WeatherStation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ObserverImplTest {
    WeatherStation weatherStation;
    ObserverImpl observer;

    @BeforeEach
    void setUp() {
        weatherStation = new WeatherStation();
        observer = new ObserverImpl(weatherStation);
        weatherStation.add(observer);
    }

    @Test
    void updateObserverWithNoArgumentOnTheObservableObject() {
        weatherStation.setTemperature(15);
        observer.Update();
        assertEquals(15, observer.result);
    }

    @Test
    void updateObserverWithArgumentOnTheObservableObject() {
        weatherStation.setTemperature(15);
        observer.Update(weatherStation);
        assertEquals(15, observer.result);

        ObserverImpl notObserving = new ObserverImpl(null);
       try {
           notObserving.Update(null);
       }catch (IncompatibleClassChangeError error){
           assertEquals("the object is not a weather station", error.getMessage());
       }

    }
}