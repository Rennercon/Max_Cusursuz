package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {
    int month = 1;

        switch (month) {
            case 1 -> System.out.println("Январь");
            case 2 -> System.out.println("Февраль");
            case 3 -> System.out.println("Март");
            case 4 -> System.out.println("Апрель");
            case 5 -> System.out.println("Май");
            case 6 -> System.out.println("Июнь");
            case 7 -> System.out.println("Июль");
            case 8 -> System.out.println("Август");
            case 9 -> System.out.println("Сентябрь");
            case 10 -> System.out.println("Октябрь");
            case 11 -> System.out.println("Ноябрь");
            case 12 -> System.out.println("Декабрь");
            default -> System.out.println("Этого месяца не существует");
        }
        int g;
        int f = 100;
        while (f <= 1000) {
            g = f % 5;
            if (g == 0) {
                System.out.println(f);
            }
            f++;
        }
        for (int i =100; i <= 1000; i++) {
            g = i % 5;
                if (g == 0) {
                    System.out.println(i);
                }
        }
        float sum = 0;
        for(int i = 1; i < 98; i += 2) {
             sum += (float) i / (i + 2);
            System.out.println(i + "/" + (i + 2) + ") " + sum);
        }
    }

}
