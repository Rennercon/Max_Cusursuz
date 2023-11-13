package homework_nr_17.Exercise_nr_2;

import homework_nr_17.threads.User1;
import homework_nr_17.threads.User2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bank2 b1 = new Bank2();
        Bank2 b2 = new Bank2();

        BankAccount2 user1 = b1.addAccount("Oleg", "Cusursuz", 5000);
        BankAccount2 user2 = b2.addAccount("Max", "Cusursuz", 0);

        Thread t1 = new Thread(new User1(b1 ,user1, user2,  1500));
        Thread t2 = new Thread(new User2(b2 ,user2, user1, 1000));

        t1.start();
        t2.start();

    }
}
