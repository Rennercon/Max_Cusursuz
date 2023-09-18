package homework_nr_5;
public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int x = numbers.length;
        for (int i = 0; i != numbers.length; i++) {
            numbers[i] = x;
            x -= 1;
            System.out.print(numbers[i] + ", ");
        }

        int sum = 0;
        long product1 = 1;
        for (int i = 0; i != 100; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
            if (numbers[i] % 2 != 0 ) {
                product1 *= numbers[i];
            }
        }
        System.out.println();
        System.out.println("Сумма четных = " + sum);
        System.out.println("Произвдение нечетных = " + product1);


        long prod = 1;
        for (int i = 1; i <= 100; i += 2) {prod *= i;}
        System.out.println("Произведение всех нечетных чисел от 1 до 100: " + prod);

        int[] copyNumbers = new int[numbers.length];
        for (int i = 0; i != numbers.length; i++) {
            copyNumbers[i] = numbers[i];
            System.out.print(copyNumbers[i] + ", ");
        }
    }
}
