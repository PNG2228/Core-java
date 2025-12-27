package com.conversion;
public class TypeConversion {
	public static void main(String[] args) {
		int x = 12345;  //4 bytes(Source)
		long y=x; //8 bytes(Destination) Implicit Type Conversion
		System.out.println(y);
		double a = 4563.63; // 8 bytes source
		int b = (int)a; 
		System.out.println(b);
	}

}
