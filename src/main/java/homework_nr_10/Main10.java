package homework_nr_10;


import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main10 {
    public static void main(String[] args) {
        Random rn = new Random();

        Predicate<Integer> isOdd = num -> num % 2 != 0;
        Consumer<String> printMessage = message -> System.out.println(message);
        Function<Integer, Integer> printNumber = num -> num * 2;
        Supplier<Integer> randomNum = () -> (int) ((Math.random()) * 10);
        System.out.println(printNumber.apply(4));
        System.out.println(isOdd.test(4));
        System.out.println(isOdd.test(3));
        printMessage.accept("Hello World");
        System.out.println(randomNum.get());
    }


}
