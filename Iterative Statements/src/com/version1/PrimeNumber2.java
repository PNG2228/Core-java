package com.version1;
import java.util.Scanner;
public class PrimeNumber2 {
	public static boolean isPrime (int n) {
	boolean isPrime = true;
	for(int i=2;i<=n/2;i++) {
		if(n%2==0) {
			isPrime=false;
			break;
		}
	}
	return isPrime;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if(isPrime(n)) {
			System.out.println("Given number is Prime");
		}else {
			System.out.println("Given number is not prime");
		}
		sc.close();
	}

}
