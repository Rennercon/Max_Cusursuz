package homework_nr_14.generics;

import homework_nr_14.dto.AirVehicle;
import homework_nr_14.dto.Airplane;
import homework_nr_14.dto.Car;
import homework_nr_14.dto.Helicopter;

public class GenericAirvehicle<T extends AirVehicle> {
    private T[] airVehicle;

    public GenericAirvehicle(T... airVehicle) {
        this.airVehicle = airVehicle;

    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 140);
        Helicopter h = new Helicopter("A 129 Mangusta", 16);
        Car car = new Car();
GenericAirvehicle g = new GenericAirvehicle(h, airplane);

    }
}
