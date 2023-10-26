package homework_nr_14;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Serializable {
    private String name;
    private final List<Vehicle> vehicleList = new ArrayList<>();

    public void addToList(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }
}
