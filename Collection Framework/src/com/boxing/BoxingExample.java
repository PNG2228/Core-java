package com.boxing;
public class BoxingExample {
	public static void main(String[] args) {
		int a = 1200;

		//Integer x = (Integer)a;
		Integer x = a; //Auto Boxing
		System.out.println(x);
		
		Double d = 4500.976588;
		
		//double e = (double)d;
		double e = d; //Auto UnBoxing
		System.out.println(e);
	}
}