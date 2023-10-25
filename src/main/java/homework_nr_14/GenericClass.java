package homework_nr_14;

import java.util.ArrayList;
import java.util.List;

public class GenericClass<T extends Number>{
    private T value;
    public GenericClass(T value) {
        this.value = value;
    }
    public static void main(String[] args) {
        GenericClass<Integer> intGeneric = new GenericClass<>(42);
        GenericClass<Double> doubleGeneric = new GenericClass<>(3.14);

        System.out.println(intGeneric.value);
        System.out.println(doubleGeneric.value);

    }





}
