package builder.gurubuilder.car;

public class CarManual {
    private int seats = 0;
    private String engine;
    private String tripComputer;
    private Boolean GPS;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String name) {
        this.engine = name;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(Boolean gps) {
        this.GPS = gps;
    }
}
