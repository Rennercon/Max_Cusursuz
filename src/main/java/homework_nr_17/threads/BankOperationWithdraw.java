package homework_nr_17.threads;

import homework_nr_17.Exercise_nr_1.Bank;
import homework_nr_17.Exercise_nr_1.BankAccount;

public class BankOperationWithdraw implements Runnable {
    private Bank bank;
    private Integer amount;

    public BankOperationWithdraw(Bank bank, Integer amount) {
        this.bank = bank;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (BankAccount e: bank.getAccountList()) {
            this.bank.withdraw(amount);
            System.out.println(e.getName() + ": " + e.getBalance());
        }
    }
}
