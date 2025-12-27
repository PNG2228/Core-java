package com.Practice;

import java.util.Scanner;

public class UniqueNonRepeatedDigitCount {
private static void getCount(int n) {
		int uc =0,nrc=0;
		int digits[] = new int[10];
		while(n>0) {
			int digit = n%10;
			digits[digit]++;
			n/=10;
		}
		for (int i = 0; i < digits.length; i++) {
			if(digits[i]==1) {
				nrc++;
			}
			if(digits[i]>0) {
				uc++;
			}
		}
		System.out.println("Unique digits count:"+uc);
		System.out.println("Non repeatable digits count:"+nrc);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		getCount(n);
		sc.close();
	}
}
