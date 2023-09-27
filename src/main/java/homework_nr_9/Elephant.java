package homework_nr_9;

public class Elephant extends Herbivor implements Animal{
    int legs;
    String name;
    int weight;
    String grass;
    public Elephant( String name, int legs, int weight, String grass) {
        this.legs = legs;
        this.name = name;
        this.weight = weight;
        this.grass = grass;
    }
    public static void main(String[] args) {
        Animal elephant1 = new Elephant("Dory", 4, 2500, "Napier grass");
        elephant1.sayWeight();
        elephant1.legs();
        elephant1.sayMyName();
        Animal.run();
        Herbivor elephant2 = new Elephant("Sarah", 4, 2300, "Napier grass");
        elephant2.favouriteGrass();
        elephant2.bestFriend();
    }

    @Override
    public void sayMyName() {
        System.out.println("Name of elephant is  " + name );
    }
    @Override
    public void sayWeight() {
        System.out.println("The weight of " + name + " is " + weight + "kg.");
    }
    @Override
    public void legs (){
        if (legs >= 0){
            System.out.println(name + " has " + legs + " legs.");
        } else {
            System.out.println("Something went wrong");
        }
    }
    @Override
    public void bestFriend() {
        System.out.println("My best friend is Dory");
    }
    @Override
    public void favouriteGrass() {
        System.out.println("I like " + grass + "grass.");
    }
}
