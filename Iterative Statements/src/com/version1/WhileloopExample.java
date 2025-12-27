package com.version1;
import java.util.Scanner;
public class WhileloopExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(true) {
        	System.out.println("Enter your name for wishes:");
        	System.out.println("Enter EXIT to exit from the program");
        	String message = sc.nextLine();
        	if(message.equals("EXIT")) {
        		break;
        	}else {
        		System.out.println("Hello hi "+message);
        	}
        }
        sc.close();
	}
}
