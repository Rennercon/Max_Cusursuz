package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
    String name;
    String surname;
    int age;
    String depatrment;

    public Employee(String name, String surname, int age, String depatrment) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.depatrment = depatrment;
    }

    public static void main(String[] args) {
        Predicate<Employee> workInSoftwareEngineering = department -> department.depatrment == "Software Engineering";
        Predicate<Employee> has20YO = years -> years.age >= 20;
        Predicate<Employee> nameStartsWithA = name -> name.name.startsWith("A");


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Anna", "Vorontsova", 32, "Management"));
        employeeList.add(new Employee("Andrey", "Kozlov", 24, "Software Engineering"));
        employeeList.add(new Employee("Vlad", "Romanov", 36, "Management"));
        employeeList.add(new Employee("Georgiy", "Koshbuc", 21, "Software Engineering"));
        employeeList.add(new Employee("Evgenia", "Gutul", 27, "Management"));

        testEmployee(employeeList, workInSoftwareEngineering);
        System.out.println("--------");
        testEmployee(employeeList, has20YO);
        System.out.println("--------");
        testEmployee(employeeList, nameStartsWithA);
    }
    public static void testEmployee(List<Employee> e, Predicate<Employee> testMethod) {
        for (Employee element:
             e) {
                if (testMethod.test(element)) {
                    System.out.println(element.name + " " + element.surname);
                }
        }
    }

}
