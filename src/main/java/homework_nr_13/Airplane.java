package homework_nr_13;

public class Airplane {
    private String manufacturer;
    private String model;
    private Integer nrOfEngines;

    public Airplane() {
    }

    public Airplane(String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneException {
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidManufacturerException("Manufacturer is empty!");
        }
        this.manufacturer = manufacturer;
        if (model == null || model.isEmpty()) {
            throw new InvalidModelException("Model is empty!");
        }
        this.model = model;
        if (nrOfEngines <= 0) {
            throw new InvalidNrOfEnginesException("Nr of engines are incorrect");
        }
        this.nrOfEngines = nrOfEngines;
    }


    public boolean isEmpty() {
        if (this.manufacturer == null && this.model == null && this.nrOfEngines == null)
            return true;
        return false;
    }

    public static void main(String[] args) {

        Airplane a1 = createAirplaneEAFP("Boeing", "54325", -4);
        if (!a1.isEmpty())
            System.out.println(a1.manufacturer);
        try {
            Airplane a2 = createAirplaneLBYL("AirLine", "2345435", -6);
            if (!a2.isEmpty())
                System.out.println(a2.manufacturer);
        } catch (InvalidAirplaneException e) {
            System.out.println("Failed to crate a new airplane, please try again");
        }

    }

    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) {
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (InvalidAirplaneException e) {
            System.out.println("Failed to crate a new airplane, please try again");
            return new Airplane();
        }
    }

    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneException {
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidManufacturerException("Manufacturer is empty!");
        }
        if (model == null || model.isEmpty()) {
            throw new InvalidModelException("Model is empty!");
        }
        if (nrOfEngines <= 0) {
            throw new InvalidNrOfEnginesException("Nr of engines are incorrect");
        }
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (InvalidAirplaneException e) {
            System.out.println("Failed");
            return new Airplane();
        }
    }
}

