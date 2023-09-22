package homework_nr_7;

public class MainNr7 {
    public static void main(String[] args) {
        Manager m1 = new Manager("Tekwill", "Max", "Cusursuz", 2, "JavaFundamentals");
        Manager m2 = new Manager("Volvo", "Oleg", "Vylkov", 2, "Trigger");
        Programmer p1 = new Programmer("Apple", "Vlad", "Filat", "C#", 12);
        Programmer p2 = new Programmer("Samsung", "Igor", "Grosu", "Python", 7);
        m1.work();
        p1.work();
        System.out.println("----------");

        m1.printMyName();
        p1.printMyName();

        Person[] persons = new Person[]{
                m1, m2, p1, p2
        };

        System.out.println("----------");
        for (int i = 0; i != persons.length; i++) {
            persons[i].work();
        }
        System.out.println("--------------");
        for (int i = 0; i != persons.length; i++) {
            if (persons[i] instanceof Manager) {
                Manager m = (Manager) persons[i];
                m.work();
            }
        }
    }
}
