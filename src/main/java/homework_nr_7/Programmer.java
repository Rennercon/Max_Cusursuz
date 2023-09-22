package homework_nr_7;

public class Programmer extends Employee{
    String programmingLanguage;
    int yearsOfExperience;

    public Programmer(String companyName, String name, String surname, String programmingLanguage, int yearsOfExperience) {
        super(companyName, name, surname);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void work() {
        System.out.println("I'm programming in " + programmingLanguage);
    }
}
