package Lesson5Task.OOPTask.Banking_Application;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, "Ram", 1000);
        account.displayBalance();
        account.withdraw(100);
        account.deposit(500);
        account.displayBalance();
    }

}

