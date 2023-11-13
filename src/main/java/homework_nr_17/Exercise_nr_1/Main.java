package homework_nr_17.Exercise_nr_1;

import homework_nr_17.threads.BankOperationDeposit;
import homework_nr_17.threads.BankOperationWithdraw;

public class Main{
    public static void main(String[] args) {
        Bank a1 = new Bank();
        a1.AddAccount("Xenia", "Cusursuz");

        Thread t1 = new Thread(new BankOperationDeposit( a1, 1000));
        Thread t2 = new Thread(new BankOperationWithdraw(a1, 800));

        t1.start();
        t2.start();

    }
}