package com.version5;
import java.util.Scanner;
public class ThrowExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age<0||age>100) {
			try {
			throw new ArithmeticException("Age must be between 0 to 100");
			}
//			catch(ArithmeticException e) {
	//			System.out.println(e);
		//	}
//			catch(ArithmeticException e) {
	//			e.printStackTrace();
		//	}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());;
			}
		}else {
			if(age>18) {
				System.out.println("You are eligible for vote");
			}else {
				System.out.println("You are not eligible for vote");
			}
		}
	}

}
