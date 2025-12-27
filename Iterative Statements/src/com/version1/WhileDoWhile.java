package com.version1;
public class WhileDoWhile {
	public static void main(String[] args) {
		int n = 10;
		while(n>10){
			System.out.println("Im in while loop");
			System.out.println(n);
		}
		int x=10;
		do {
			System.out.println("Im in do while loop");
			System.out.println(x);
			x--;
		}while(x>10);
	}
}
