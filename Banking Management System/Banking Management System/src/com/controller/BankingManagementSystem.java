package com.controller;
import java.util.*;
import com.model.Account;
import com.model.CurrentAccount;
import com.model.Customer;
import com.model.SavingsAccount;
public class BankingManagementSystem {
	Map<String,Customer> customers = new LinkedHashMap<String,Customer>();
	Map<String,Account> accounts = new LinkedHashMap<String,Account>();
	public void createCustomer(String id, String name) {
		if(customers.containsKey(id)) {
			System.out.println("Customer ID aldready exist");
		}else {
			Customer sc = new Customer(id,name);
			customers.put(id,sc);
			System.out.println("Customer created successfully");
		}
	}
	public void createAccount(String acc_type, String acc_number, String cus_id, double balance) {
		if(customers.containsKey(cus_id)) {
			if(accounts.containsKey(acc_number)) {
				System.out.println("Account number aldready exist");
			}else {
				if(acc_type.equalsIgnoreCase("Savings")) {
					Customer sc = customers.get(cus_id);
					Account account = new SavingsAccount(acc_number,sc,balance);
				}else if(acc_type.equalsIgnoreCase("Current")) {
					Customer sc = customers.get(cus_id);
					Account account = new CurrentAccount(acc_number,sc,balance);
				}else {
					System.out.println("Invalid account type");
				}
			}
		}else {
			System.out.println("Customer not exists");
		}
	}
	public void deposit(String dep_acc_number, double dep_amount) {
		if(accounts.containsKey(dep_acc_number)) {
			Account account = accounts.get(dep_acc_number);
			account.deposit(dep_amount);
			System.out.println("Amount deposited successfully");
		}else {
			System.out.println("Invalid account number");
		}
	}
	public void withdraw(String wd_acc_number, double wd_amount) {
		if(accounts.containsKey(wd_acc_number)) {
			Account account = accounts.get(wd_acc_number);
			account.withdraw(wd_amount);
			System.out.println("Amount withdrawn successfully");
		}else {
			System.out.println("Invalid account number");
		}
	}
	public void checkBalance(String chk_acc_number) {
		if(accounts.containsKey(chk_acc_number)) {
			Account account = accounts.get(chk_acc_number);
			System.out.println(account.getBalance());
		}else {
			System.out.println("Invalid account number");
		}
	}
	public void viewAccounts() {
		Collection<Account> accs = accounts.values();
		for(Account sc: accs) {
			System.out.println(sc);
		}
	}
}
