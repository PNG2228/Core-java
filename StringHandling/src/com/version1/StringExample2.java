package com.version1;
public class StringExample2 {
	public static void main(String[] args) {
		String obj1 = "Charan AI Master";
		String obj2 = "Charan AI Master";
		String obj3 = new String("Dileep 143");
		String obj4 = new String("Dileep 143");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));
		System.out.println(obj1==obj2);
		System.out.println(obj3==obj4);
	}
}