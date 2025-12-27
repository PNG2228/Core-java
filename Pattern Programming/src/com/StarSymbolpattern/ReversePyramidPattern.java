package com.StarSymbolpattern;

import java.util.Scanner;

public class ReversePyramidPattern {
	public static void printPyramidpattern(int lines) {
		for(int i=lines;i>=1;i--) {
			for(int space=lines-i;space>=1;space--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
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
