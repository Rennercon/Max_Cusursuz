package homework_nr_7;

public abstract class Employee extends Person{
   String companyName;

    public Employee(String companyName, String name,String surname) {
        super(name, surname);
        this.companyName = companyName;
    }

    public abstract void work();

}
