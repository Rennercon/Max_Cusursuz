package homework_nr_15;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(1997, "Mazda");
        Car car2 = new Car(2022, "Mercedes");
        Car car3 = new Car(2005, "BMW");
        Car car4 = new Car(2013, "Audi");

        Set<Car> carHashSet = new HashSet<>();
        Set<Car> carTreeSet = new TreeSet<>();

        carHashSet.add(car1);
        carHashSet.add(car2);
        carHashSet.add(car3);
        carHashSet.add(car4);

        carTreeSet.add(car1);
        carTreeSet.add(car2);
        carTreeSet.add(car3);
        carTreeSet.add(car4);

        carHashSet.stream()
                .sorted(Sort.SORT_BY_AGE.getComparator())
                .forEach(e -> System.out.println(e.toString()));
        System.out.println("---------------");
        carTreeSet.stream()
                .sorted(Sort.SORT_BY_NAME.getComparator())
                .forEach(e -> System.out.println(e.toString()));


    }
}
