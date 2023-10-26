package homework_nr_15;

import lombok.Getter;

import java.util.Comparator;
import java.util.PrimitiveIterator;

@Getter
public class Car implements Comparable<Car>{
    private static int globalId =0;
    private int id;
    private int yearMade;
    private String name;

    public Car(int yearMade, String name) {
        id = globalId;
        globalId++;
        this.yearMade = yearMade;
        this.name = name;

    }

    @Override
    public int compareTo(Car o) {
        return Comparator.comparing((Car c1) -> c1.getYearMade())
                .thenComparing((Car c1) -> c1.getName())
                .compare(this, o);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                "yearMade=" + yearMade +
                ", name='" + name + '\'' +
                '}';
    }
}
