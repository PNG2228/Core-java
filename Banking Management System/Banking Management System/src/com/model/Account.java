package com.model;
public  abstract class Account {
	private String accountnumber;
	private Customer customer;
	private double balance;
	public Account(String accountnumber, Customer customer, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.customer = customer;
		this.balance = balance;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", customer=" + customer + ", balance=" + balance + "]";
	}
	public void deposit(double amount) {
		balance = balance + amount;
	}
	public abstract void withdraw(double amount);
}
