package observer.observable.impl;

import observer.observers.impl.ObserverImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class WeatherStationTest {

    @Mock
    ObserverImpl observer;

    @InjectMocks
    WeatherStation weatherStation;
    int temperature;

    @BeforeEach
    void setUp() {
        weatherStation = new WeatherStation();
    }

    @Test
    void add() {
        weatherStation.add(observer);

        assertEquals(1, weatherStation.observers.size());
    }

    @Test
    void remove() {
        weatherStation.add(observer);

        assertEquals(1, weatherStation.observers.size());

        weatherStation.remove(observer);

        assertEquals(0, weatherStation.observers.size());
    }

    @Test
    void notifyObserver() {
        weatherStation.add(observer);
        weatherStation.notifyObserver();

        verify(observer).Update();
    }

    @Test
    void notifyObservers() {
        weatherStation.add(observer);
        weatherStation.notifyObservers();

        verify(observer).Update(any());
    }

    @Test
    void setTemperature() {
        weatherStation.setTemperature(15);

        assertEquals(15, weatherStation.temperature);
    }

    @Test
    void getTemperature() {
        weatherStation.setTemperature(15);
        this.temperature = weatherStation.getTemperature();

        assertEquals(15, this.temperature);
    }
}