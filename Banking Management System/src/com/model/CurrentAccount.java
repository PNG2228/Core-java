package com.model;

public class CurrentAccount extends Account {

    private static final double OVER_DRAFT_LIMIT = -10000.00;

    public CurrentAccount(String accountNumber, Customer customer, double balance) {
        super(accountNumber, customer, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= OVER_DRAFT_LIMIT) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        } else {
            System.out.println("Over draft limit exceeded");
        }
    }
}
