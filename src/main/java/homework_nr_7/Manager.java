package homework_nr_7;

public class Manager extends Employee{
    int teamSize;
    String teamName;

    public Manager(String companyName, String name, String surname, int teamSize, String teamName) {
        super(companyName, name, surname);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    public void work() {
        System.out.println("I am a manager in " + teamName);
    }
}
