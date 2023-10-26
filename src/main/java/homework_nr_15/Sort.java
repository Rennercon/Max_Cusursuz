package homework_nr_15;

import java.util.Comparator;

public enum Sort {
    SORT_BY_NAME(Comparator.comparing((Car p)-> p.getName())),
    SORT_BY_AGE(Comparator.comparing((Car p) -> p.getYearMade()));

    private final Comparator<Car> comparator;

    Sort(Comparator<Car> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Car> getComparator() {
        return comparator;
    }
}
