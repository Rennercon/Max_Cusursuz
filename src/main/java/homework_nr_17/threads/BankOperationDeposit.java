package homework_nr_17.threads;

import homework_nr_17.Exercise_nr_1.Bank;
import homework_nr_17.Exercise_nr_1.BankAccount;

public class BankOperationDeposit implements Runnable{

    private Bank bank;
    private Integer amount;

    public BankOperationDeposit(Bank bank, Integer amount) {
        this.bank = bank;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (BankAccount e: bank.getAccountList()) {
            this.bank.deposit(amount);
            System.out.println(e.getName() + ": " + e.getBalance());
        }
    }
}
