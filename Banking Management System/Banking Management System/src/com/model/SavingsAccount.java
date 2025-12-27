package com.model;
public class SavingsAccount extends Account {
	private static final double MINIMUM_BALANCE = 10000.00;
	public SavingsAccount(String accountnumber, Customer customer, double balance) {
		super(accountnumber, customer, balance);
	}
	@Override
	public void withdraw(double amount) {
		if(getBalance() - amount >= MINIMUM_BALANCE) {
			setBalance(getBalance() - amount);
			System.out.println("Withdraw succesful");
		}else {
			System.out.println("Insufficient funds");
		}
	}
}
