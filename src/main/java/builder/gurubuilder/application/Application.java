package builder.gurubuilder.application;

import builder.gurubuilder.car.Car;
import builder.gurubuilder.car.CarManual;
import builder.gurubuilder.car.builder.CarBuilder;
import builder.gurubuilder.car.builder.CarManualBuilder;
import builder.gurubuilder.director.Director;

public class Application {

    public void makeCar(){
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getProduct();

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportCar(builder);
        CarManual manual = manualBuilder.getProduct();
    }
}
