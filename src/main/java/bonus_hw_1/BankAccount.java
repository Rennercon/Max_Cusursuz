package bonus_hw_1;

public class BankAccount {

    private int accountNumber;
    private static int num = 0;
    private String name;
    private double balance = 0;

    public BankAccount(String name, double balance) {
        this.accountNumber = num;
        num +=1;
        this.name = name;
        this.balance = balance;
        if (balance < 0) {
            this.balance = 0;
        }
    }
    public void deposit (double sum) {
        balance += sum;
    }
    public void withdraw (double sum) {
        if (balance < sum) {
            System.out.println("На счету недостаточно средств!");
            return;
        } else {
            balance -= sum;
        }

    }
    public double checkBalance () {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

