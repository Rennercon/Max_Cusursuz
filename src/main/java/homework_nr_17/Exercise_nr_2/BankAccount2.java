package homework_nr_17.Exercise_nr_2;

import lombok.Data;

@Data
public class BankAccount2 {
    private String name;
    private String Surname;
    private Double balance = 0d;
    private Integer id;
    private static Integer globalId = 0;

    public BankAccount2(String name, String surname, Integer balance) {
        this.name = name;
        Surname = surname;
        this.id = globalId;
        this.balance = Double.valueOf(balance);
        globalId++;
    }
    public Double getBalance() {
        return balance;
    }

    public synchronized void setBalance(Double balance) {
        this.balance = balance;
    }
}
