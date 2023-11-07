package homework_nr_17.Exercise_nr_1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static List<BankAccount> accountList = new ArrayList<>();

    public void AddAccount(String name, String surname) {
        BankAccount bank = new BankAccount(name, surname);
        accountList.add(bank);
    }

    public synchronized void deposit(double amount) {
            if (amount > 0) {
                for (BankAccount element :
                        accountList) {
                    element.setBalance(element.getBalance() + amount);
                    System.out.println(element.getBalance());
                }

            } else {
                System.out.println("Error: incorrect deposit value");
            }
    }

    public static List<BankAccount> getAccountList() {
        return accountList;
    }

    public synchronized void withdraw(double amount) {
            for (BankAccount element :
                    accountList) {
                if (amount < element.getBalance() && amount > 0) {
                    element.setBalance(element.getBalance() - amount);
                    System.out.println(element.getBalance());
                } else if (amount < element.getBalance() && amount < 0) {
                    if (amount * -1 < element.getBalance()) {
                        element.setBalance(element.getBalance() - (amount * -1));
                    }
                } else {
                    System.out.println("Error: insufficient funds");
                }
            }
    }
}

