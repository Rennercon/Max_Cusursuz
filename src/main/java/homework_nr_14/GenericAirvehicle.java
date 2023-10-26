package homework_nr_14;

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
