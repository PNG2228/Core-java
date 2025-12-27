package com.StarSymbolpattern;

import java.util.Scanner;

public class PyramidPattern {
	public static void printPyramidpattern(int lines) {
		for(int i=1;i<=lines;i++) {
			for(int space=1;space<=lines-i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines in pattern");
		int lines = sc.nextInt();
		printPyramidpattern(lines);
		sc.close();
	}
}
