package entities;

public class BankAccount {
    private int number;
    private String holder;
    private double balance;

    public BankAccount(int number, String holder, double initialDep) {
        this.number = number;
        this.holder = holder;
        deposit(initialDep);
    }

    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() { return this.number; }
    public String getHolder() { return this.holder; }
    public double getBalance() { return this.balance; }

    public void deposit(double value) {
        this.balance += value; 
    }

    public void withdraw(double value) {
        this.balance -= value + 5;
    }
}