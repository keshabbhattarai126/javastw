package Lesson5Task.OOPTask.Banking_Application;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return false;
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
        return true;
    }

    public void displayBalance() {
        System.out.println("Account balance: " + balance);
    }
}
