package com.io;
import java.util.Scanner;
public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter byte Value");
		byte a = scanner.nextByte();
		System.out.println("Enter short Value");
		short b = scanner.nextShort();
		System.out.println("Enter int Value");
		int c = scanner.nextInt();
		System.out.println("Enter long Value");
		long d = scanner.nextLong();
		System.out.println("Enter float Value");
		float e = scanner.nextFloat();
		System.out.println("Enter double Value");
		double f = scanner.nextDouble();
		System.out.println("Enter boolean Value");
		boolean g = scanner.nextBoolean();
		System.out.println("Enter String Value");
		String h = scanner.next();
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
		 System.out.println(e);
		 System.out.println(f);
		 System.out.println(g);
		 System.out.println(h);
		 scanner.close(); 
	}

}
