package homework_nr_14;

import java.util.ArrayList;
import java.util.List;

public class GenericVehicle<T extends AirVehicle> {
    private List<T> airVehicle;

    public GenericVehicle(List<T> airVehicle) {
        this.airVehicle = airVehicle;
        airVehicle = new ArrayList<>();
    }

    public static void main(String[] args) {


    }
}
