package builder.gurubuilder.car.builder;

public interface Builder {

    void reset();
    void setSeats(int seats);

    void setEngine(String name);

    void setTripComputer(String tripComputer);

    void setGPS(Boolean GPS);
}
