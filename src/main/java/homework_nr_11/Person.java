package homework_nr_11;

import java.util.*;
public class Person {
    String name;
    String surname;
    Integer age;
    boolean isPayedByHour;

    public Person(String name, String surname, Integer age, boolean isPayedByHour) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByHour = isPayedByHour;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Max", "Cusursuz", 19, true);
        Person p2 = new Person("Alex", "Gray", 24, true);
        Person p3 = new Person("Jose", "Fernandez", 33, true);
        Person p4 = new Person("Ivan", "Anderson", 36, false);
        Person p5 = new Person("Oleg", "Cusursuz", 41, true);
        Person p6 = new Person("Vitaliy", "Byrd", 37, false);
        Person p7 = new Person("Xenia", "White", 26, true);
        Person p8 = new Person("Nastea", "Smith", 22, false);
        Person p9 = new Person("Julia", "Berry", 25, true);
        Person p10 = new Person("Evgeniy", "Green", 30, true);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        persons.add(p6);
        persons.add(p7);
        persons.add(p8);
        persons.add(p9);
        persons.add(p10);

         List<Person> sortedPersons1 = persons.stream()
                 .filter(e -> e.age > 25 & e.isPayedByHour)
                         .toList();

        for (Person element:
             sortedPersons1) {
            System.out.println(element.name);
        }

        List<Person> SortedPersons2 = persons.stream()
                .filter(e -> e.age > 30 & e.surname.startsWith("A"))
                .toList();

        for (Person element:
             SortedPersons2) {
            System.out.println(element.name + " " + element.surname);
        }

        Optional<Person> optionalPerson = persons.stream()
                .filter(e -> e.age == 37)
                .findFirst();
        optionalPerson.ifPresent(person -> System.out.println(person.name + " " + person.surname));

    }

}
