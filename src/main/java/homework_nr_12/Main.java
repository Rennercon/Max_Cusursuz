package homework_nr_12;

public class Main {
    public static void main(String[] args) {
        Months[] months = Months.values();
        for (Months month:
             months) {
            System.out.println(month);
        }

        System.out.println(FuelTypes.DIESEL.isLiquidFuel());
        System.out.println(FuelTypes.CNG.isLiquidFuel());
        System.out.println(FuelTypes.GASOLINE.isLiquidFuel());
        System.out.println(FuelTypes.LPG.isLiquidFuel());
        System.out.println(FuelTypes.ELECTRIC.isLiquidFuel());

        CheckInteger h = CheckInteger.valueOf("FIRST");
        System.out.println(h.CHECK_IF_EVEN());
        System.out.println(h.CHECK_IF_NEGATIVE());
        System.out.println(h.CHECK_IF_ODD());
        System.out.println(h.CHECK_IF_POSITIVE());



    }
}
