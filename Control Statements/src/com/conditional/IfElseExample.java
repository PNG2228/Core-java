package com.conditional;
import java.util.Scanner;
public class IfElseExample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name:");
	String name = sc.nextLine();
	System.out.println("Enter your Age:");
	int age=sc.nextInt();
    
	if(age >=18) {
		System.out.println("Hello "+name+" you are eligible for vote...");
	}
	else {
		System.out.println("Hello "+name+" you are not eligible for vote...");
	}
    sc.close();
}
}

