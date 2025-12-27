package com.version1;
import java.util.Scanner;
public class ForFactorial2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= sc.nextInt();
		if(n>=0) {
        int fact = 1;
        for(int i=n;i>=1;i--) {
        	fact = i*fact;
        }
        System.out.println("Factorial is "+fact);
		}else {
			System.out.println("Please enter positive numbers");
		}
        sc.close();
	}
}
