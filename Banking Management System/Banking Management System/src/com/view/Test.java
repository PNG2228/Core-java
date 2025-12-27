package com.view;
import java.util.Scanner;
import com.controller.BankingManagementSystem;
public class Test {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		BankingManagementSystem bms = new BankingManagementSystem();
		int choice =0;
		while(true) {
			System.out.println("**************************************************");
			System.out.println("**************************************************");
			System.out.println("****** Welcome to Banking Management System ******");
			System.out.println("**************************************************");
			System.out.println("**********     1. Create Customer    *************");
			System.out.println("**********     2. Create Account     *************");
			System.out.println("**********     3. Deposit Amount     *************");
			System.out.println("**********     4. Withdraw Amount    *************");
			System.out.println("**********     5. Check Balance      *************");
			System.out.println("**********     6. View Accoubts      *************");
			System.out.println("**********     7. Exit               *************");
			System.out.println("**************************************************");
			System.out.println("**************************************************");
			choice = sc.nextInt();
			switch(choice) {
			    case 1 : 
			    	System.out.println("Enter id");
			    	String id = sc.next();
			    	System.out.println("Enter name");
			    	String name = sc.next();
			    	bms.createCustomer(id,name);
			        break;
			    case 2 :
			    	System.out.println("Enter account type: Savings/Current");
			    	String acc_type = sc.next();
			    	System.out.println("Enter account number");
			    	String acc_number =sc.next();
			    	System.out.println("Enter customer id");
			    	String cus_id = sc.next();
			    	System.out.println("Enter initial balance");
			    	double balance = sc.nextDouble();
			    	bms.createAccount(acc_type,acc_number,cus_id,balance);
			        break;
			    case 3 :
			    	System.out.println("Enter account number");
			    	String dep_acc_number = sc.next();
			    	System.out.println("Enter amount");
			    	double dep_amount =sc.nextDouble();
			    	bms.deposit(dep_acc_number,dep_amount);
			        break;
			    case 4 :
			    	System.out.println("Enter account number");
			    	String wd_acc_number = sc.next();
			    	System.out.println("Enter amount");
			    	double wd_amount =sc.nextDouble();
			    	bms.withdraw(wd_acc_number,wd_amount);
			        break;
			    case 5 :
			    	System.out.println("Enter account number");
			    	String chk_acc_number = sc.next();
			    	bms.checkBalance(chk_acc_number);
			        break;
			    case 6 :
			    	bms.viewAccounts();
			    	break;
			    case 7:
			    	System.exit(0);
			        break;
			    default:
			    	System.out.println("Please enter valid choice");
			}
		}
	}
}
