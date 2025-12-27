package com.conditional;
import java.util.Scanner;
public class NestedIfExample {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name:");
	String name = sc.nextLine();
	System.out.println("Enter your Age:");
	int age=sc.nextInt();
    if(age >=0 && age <=120) {
	    if(age >=18) {
	    	if(age >= 60) {
	    		System.out.println("Hello "+name+" you are eligible for vote...");
	    		System.out.println("You are a senior citizen");
	    	}else {
	    		System.out.println("Hello "+name+" you are eligible for vote...");
	    		System.out.println("You are not a senior citizen");
	    	}
	    }
	    else {
		     System.out.println("Hello "+name+" you are not eligible for vote...");
	    }
    } else {
    	System.out.println("Hello "+name+" Please enter valid age:");
    }
    sc.close();
}
}

