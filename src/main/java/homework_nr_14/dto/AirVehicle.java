package homework_nr_14.dto;

public abstract class AirVehicle extends Vehicle {
    private String model;
    private int nrOfSeats;

    public AirVehicle(String model, int nrOfSeats) {
        this.model = model;
        this.nrOfSeats = nrOfSeats;
    }
}
