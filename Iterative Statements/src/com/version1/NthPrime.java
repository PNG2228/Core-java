package com.version1;
import java.util.Scanner;
public class NthPrime {
	static int isPrime(int n) {
		int num = 1;
		int count = 0;
		while(count < n) {
			int i = 2;
			boolean isprime = true;
			num++;
			while(i<=num/2) {
				if(num % i == 0) {
					isprime = false;
					break;
				}
				i++;	
			}
			if(isprime) {
				count++;
			}		
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPrime(n));
		sc.close();
	}
}

