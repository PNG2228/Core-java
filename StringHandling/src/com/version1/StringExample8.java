package com.version1;
public class StringExample8 {
	public static void main(String[]args) {
		String subject = "Java Programming Language";
		String substr = subject.substring(0,4);
		System.out.println(substr);
	    substr = subject.substring(5,16);
		System.out.println(substr);
		substr = subject.substring(5);
		System.out.println(substr);
	}
}
