package bonus_hw_1;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount("Max");
        bank.addAccount("Vladimir");
        bank.addAccount("Serghey");
        bank.addAccount("Anna");
        bank.addAccount("Stanislav");
        bank.addAccount("Maria");
        bank.showInformation("Anna");
        bank.transaction("Max", "Deposit", 542.2);
        bank.transaction("Vladimir", "Deposit", 12.32);
        bank.transaction("Serghey", "Deposit", 0.2);
        bank.transaction("Anna", "Withdraw", 3001);
        bank.transaction("Stanislav", "Deposit", 9);
        bank.transaction("Maria", "Deposit", 27.8);
        bank.transaction("Anna", "Deposit", 3000.5);
        bank.showAccounts();

        bank.showInformation("Anna");
    }

}
