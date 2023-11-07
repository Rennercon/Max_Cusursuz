package homework_nr_17.Exercise_nr_1;

import lombok.Data;
@Data
public class BankAccount {

    private String name;
    private String Surname;
    private Double balance = 0d;
    private Integer id;
    private static Integer globalId = 0;


    public BankAccount(String name, String surname) {
        this.name = name;
        Surname = surname;
        this.id = globalId;
        globalId++;
    }

    public Double getBalance() {
        return balance;
    }

    public synchronized void setBalance(Double balance) {
        this.balance = balance;
    }
}

