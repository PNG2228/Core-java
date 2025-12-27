package com.recurssion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		for (int i = 2; i < n; i++) {
			int next=n1+n2;
			System.out.print(next+" ");
			n1=n2;
			n2=next;
		}
		sc.close();
	}
}
