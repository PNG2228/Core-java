package com.StarSymbolpattern;

import java.util.Scanner;

public class HallowDiamondPattern {
	public static void printPyramidpattern(int lines) {
		for(int i=1;i<lines;i++) {
			for(int space=1;space<=lines-i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
//				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=lines;i>=1;i--) {
			for(int space=lines-i;space>=1;space--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				if(j==1||j==i) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
//				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines");
		int lines = sc.nextInt();
		printPyramidpattern(lines);
		sc.close();
	}
}
