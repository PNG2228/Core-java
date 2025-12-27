package com.operators;
import java.util.Scanner;
public class TernayOperatorExample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name:");
	String a = sc.nextLine();
	System.out.println("Enter your Age:");
	int age=sc.nextInt();
	String result = (age >=18) && (age<=120)? "You are eleigible to vote":(age>120||age<0)? "Age must be >=0 and <=120":"Not eligible for vote";
    System.out.println("Hello "+a+" "+result);
    sc.close();
}
}

