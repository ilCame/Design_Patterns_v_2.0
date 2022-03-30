package builder.gurubuilder.car.builder;

import builder.gurubuilder.car.CarManual;

public class CarManualBuilder implements Builder{
    private CarManual carManual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.carManual = new CarManual();
    }

    @Override
    public void setSeats(int seats) {
         this.carManual.setSeats(seats);
    }

    @Override
    public void setEngine(String name) {
         this.carManual.setEngine(name);
    }

    @Override
    public void setTripComputer(String tripComputer) {
         this.carManual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(Boolean GPS) {
         this.carManual.setGPS(GPS);
    }

    public CarManual getProduct(){
        CarManual product = this.carManual;
        this.reset();
        return product;
    }
}
