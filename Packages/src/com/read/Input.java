package com.read;

import java.util.Scanner;

public class Input {
	public int a,b;
	public void readInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		a = sc.nextInt();
		System.out.println("Enter b value");
		b = sc.nextInt();
		sc.close();
	}
	}
