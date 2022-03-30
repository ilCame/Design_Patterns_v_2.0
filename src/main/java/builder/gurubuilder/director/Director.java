package builder.gurubuilder.director;

import builder.gurubuilder.car.builder.Builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructSportCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Sport Engine");
        builder.setTripComputer("tripComputer");
        builder.setGPS(true);
    }

    public void constructSuvCar(Builder builder){
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("Normal Engine");
        builder.setTripComputer("tripComputer");
        builder.setGPS(true);
    }
}

