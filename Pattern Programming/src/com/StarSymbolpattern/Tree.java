package com.StarSymbolpattern;

public class Tree {
	public static void TreePattern(int lines) {
		for(int i = 1; i <= lines/3; i++ ) {
			for(int space = 1; space <=lines-i; space++) {
				System.out.print(" ");
			}
			for(int star =1; star <=i; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 2; i <= lines/2; i++ ) {
			for(int space = 1; space <=lines-i; space++) {
				System.out.print(" ");
			}
			for(int star =1; star <=i; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 3; i <= (lines/2)+2; i++ ) {
			for(int space = 1; space <=lines-i; space++) {
				System.out.print(" ");
			}
			for(int star =1; star <=i; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 4; i <= ((lines/2)+4); i++ ) {
			for(int space = 1; space <=lines-i; space++) {
				System.out.print(" ");
			}
			for(int star =1; star <=i; star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<lines/3;i++) {
			for(int space = 1;space <= lines-2; space++) {
				System.out.print(" ");
			}
			for(int j=1;j<4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=lines*2;i++) System.out.print("*");
	}
	
	public static void main(String[] args) {
    	TreePattern(15);
	}
}