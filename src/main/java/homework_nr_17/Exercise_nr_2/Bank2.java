package homework_nr_17.Exercise_nr_2;


public class Bank2 {

    public synchronized BankAccount2 addAccount(String name, String surname, Integer balance) {
        BankAccount2 bank = new BankAccount2(name, surname, balance);
        return bank;
    }
    public synchronized void transfer(BankAccount2 sender, BankAccount2 recipient, Integer amount) {
        while (sender.getBalance() < amount) {
            try {
                System.out.println("Недостаточно средств на счете " + sender.getName() + ". Ожидание...");
                wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        recipient.setBalance(amount.doubleValue() + recipient.getBalance());
        notifyAll();
    }
}

