package com.version1;
import java.util.Scanner;
public class DoWhileFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= sc.nextInt();
		if(n>=0) {
        int fact = 1;
        int i = 1;
        do {
        	fact = i*fact;
        	i++;
        }while(i<=n);
        System.out.println("Factorial is "+fact);
		}else {
			System.out.println("Please enter positive numbers");
		}
        sc.close();
	}
}
