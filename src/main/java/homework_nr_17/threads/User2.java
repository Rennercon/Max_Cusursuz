package homework_nr_17.threads;

import homework_nr_17.Constants;
import homework_nr_17.Exercise_nr_2.Bank2;
import homework_nr_17.Exercise_nr_2.BankAccount2;

public class User2 implements Runnable{
    private Bank2  bank2;
    private BankAccount2 sender;
    private BankAccount2 recipient;
    private Integer amount;

    public User2(Bank2  bank2, BankAccount2 sender, BankAccount2 recipient, Integer amount) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.bank2 = bank2;
    }

    @Override
    public void run() {
        bank2.transfer(sender, recipient, amount);
        System.out.println(Constants.ANSI_BLUE + "Переведено " + amount + " лей с счета " + sender.getName() + " на счет " + recipient.getName() + ".");
        System.out.println(Constants.ANSI_BLUE +  "Баланс счета 1: " + sender.getBalance() + " лей, Баланс счета 2: " + recipient.getBalance() + " лей");
    }
}
