package bonus_hw_1;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private static List<BankAccount> accountList = new ArrayList<>();


    public void addAccount(String name) {
        accountList.add(new BankAccount(name, 0));
    }
    public void transaction(String name, String transaction, double sum) {
        for (BankAccount element:
                accountList) {
            if (element.getName() == name){
                if (transaction == "Deposit") {
                    DepositTransaction deposit1 = new DepositTransaction(element, sum);
                    deposit1.process();
                } else if (transaction == "Withdraw") {
                        WithdrawalTransaction withdraw = new WithdrawalTransaction(element, sum);
                        withdraw.process();
                } else System.out.println("Deposit или Withdraw");
            }
        }

    }
    public void showInformation(String name) {
        for (BankAccount element:
                accountList) {
            if (element.getName() == name) {
                System.out.println("Your balance: " + element.checkBalance());
            }
        }
    }
    public void showAccounts() {
        for (BankAccount element:
                accountList) {
            System.out.println(element.getAccountNumber() + ") " + element.getName() + ": " + element.checkBalance());
        }
    }
}
