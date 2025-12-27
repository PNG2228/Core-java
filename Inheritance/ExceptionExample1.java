package com.version1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value:");
		int b = sc.nextInt();
		try {
			int c = a/b;
			System.out.println("Divison is"+c);
		}
		catch(ArithmeticException e){
			System.out.println("Hello don't enter b value as zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Hello check your input");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}
