package com.recurssion;
public class Factorial {
	public static int getFact(int n) {
		if(n==0||n==1) {
			return 1;
		}else {
			return n*getFact(n-1);
		}
	}
	public static void main(String[] args) {
		int fact =Factorial.getFact(5);
		System.out.println(fact);
	}
}
