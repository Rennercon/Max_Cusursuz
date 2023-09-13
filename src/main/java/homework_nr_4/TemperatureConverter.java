package homework_nr_4;

public class TemperatureConverter {
        static float celsius;
        static float fahrenheit;

    //Метод Main
    public static void main(String[] args) {
        System.out.println("Изменено " + 46 + " фаренгейтов в " + TemperatureConverter.toCelsius(46) + " цельсий");
        System.out.println("Изменено " + 29 + " цельсий в " + TemperatureConverter.toFahrenheit(29) + " фаренгейтов");

    }

    public static float  toCelsius(float fahrenheit) {
        return (fahrenheit - 32) / 9 * 5;
    }

    public static float toFahrenheit(float celsius) {
        return (celsius * 9 / 5 ) + 32;
    }

}
