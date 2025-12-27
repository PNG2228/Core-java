package com.pp;

import java.util.Scanner;

public class Arthmatic {
	int x,y,z;
	Scanner scanner = new Scanner(System.in);

	public void add() { //without return  type and without parameters
		System.out.println("Enter x value");
		x = scanner.nextInt();
		System.out.println("Enter y value");
		y = scanner.nextInt();
		z = x+y;
		System.out.println("Addition is "+z);
		
	}
	public void sub(int a, int b) { //without return type and with parameters
		x = a;
		y = b;
		z = x-y;
		System.out.println("Subtraction is "+z);
		
	}
	public int mul() { //with return type and without parameters
		System.out.println("Enter x value");
		x = scanner.nextInt();
		System.out.println("Enter y value");
		y = scanner.nextInt();
		z = x * y;
		return z;	
		
	}
	public int div(int a, int b) { // with return type and with parameters
		x = a;
		y = b;
		z = x/y;
		return z;		
	}
	public static void main(String[] args) {
		Arthmatic obj = new Arthmatic();
		obj.add();
		obj.sub(17, 5);
		System.out.println("multiplication is:"+obj.mul());
		System.out.println("Division is:"+obj.div(15, 5));

	}

}
