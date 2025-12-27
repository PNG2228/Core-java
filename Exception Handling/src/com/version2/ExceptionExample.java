package com.version2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 try {
			 System.out.println("Enter a value: ");
			 int a = sc.nextInt();
			 
			 System.out.println("Enter b value: ");
			 int b = sc.nextInt();
			 
			 int c = a/b;
			 System.out.println("Division Value: "+c);
		 }
		 catch(InputMismatchException e) {
			 System.out.println("Please enter correct value");
		 }
		 catch(ArithmeticException e) {
			 System.out.println("Don't enter b value 0");
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }finally {
		 sc.close();
		 System.out.println("Scanner closed");
		 }
	}
}