package builder.gurubuilder.car.builder;

import builder.gurubuilder.car.Car;

public class CarBuilder implements Builder{

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    public void reset() {
        this.car = new Car();
    }

    public void setSeats(int seats){
         this.car.setSeats(seats);
    }

    public void setEngine(String name){
         this.car.setEngine(name);
    }

    public void setTripComputer(String tripComputer){
         this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(Boolean GPS) {
         this.car.setGPS(GPS);
    }

    public Car getProduct(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
