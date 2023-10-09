package bonus_hw_1;

public class DepositTransaction implements Transaction{
    private final BankAccount user;
    private double sum = 0;

    public DepositTransaction(BankAccount user, double sum) {
        this.user = user;
        this.sum = sum;
    }
    public void process() {
        user.deposit(sum);
    }
}
