package homework_nr_6;

public class Invoice {
    private String model;
    private String description;
    private static int numberOfProducts = 0;
    private double cost = 0;

    private static double sum = 0;

    public Invoice(String model, String description, double cost) {
        this.model = model;
        this.description = description;
        this.cost = cost;
        sum += cost;
        numberOfProducts++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfProducts() {
        return this.numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static double getAmount () {
        return sum;
    }

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Dyson", "good one", 24.45);
        Invoice invoice2 = new Invoice("Puma", "nice T-shirt",  77.99);
        System.out.println(getAmount());
    }
}
