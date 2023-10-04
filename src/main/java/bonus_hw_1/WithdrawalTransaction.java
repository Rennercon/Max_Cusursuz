package bonus_hw_1;

public class WithdrawalTransaction implements Transaction{
    private final BankAccount user;
    private double sum = 0;

    public WithdrawalTransaction(BankAccount user, double sum) {
        this.user = user;
        this.sum = sum;
    }

    @Override
    public void process(){
        user.withdraw(sum);
    }
}
