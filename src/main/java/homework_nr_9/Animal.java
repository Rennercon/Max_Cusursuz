package homework_nr_9;

public interface Animal {

    void sayMyName();
    void sayWeight();
    default void legs (){
        System.out.println("This animal has no legs");
    }
    static void run() {
        System.out.println("Animal is running");

    }
}
