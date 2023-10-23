package homework_nr_12;

public enum FuelTypes {
    GASOLINE(true),
    DIESEL(true),
    CNG(false),
    LPG(false),
    ELECTRIC(false);

    private boolean isLiquid;

    FuelTypes(boolean x) {
        this.isLiquid = x;
    }

    public boolean isLiquidFuel() {
        return isLiquid;
    }
}
