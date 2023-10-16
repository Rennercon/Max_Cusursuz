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

        chekIntegerAndPrintTheResult(53, CheckInteger.CHECK_IF_ODD );
        chekIntegerAndPrintTheResult(-2, CheckInteger.CHECK_IF_EVEN );
        chekIntegerAndPrintTheResult(17, CheckInteger.CHECK_IF_NEGATIVE);
        chekIntegerAndPrintTheResult(0, CheckInteger.CHECK_IF_POSITIVE);

    }
    public static void chekIntegerAndPrintTheResult(int x, CheckInteger check){
        System.out.println(check.getCheckInteger().test(x));
    }
}
