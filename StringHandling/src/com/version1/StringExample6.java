package com.version1;
public class StringExample6 {
	public static void main(String[]args) {
		String email1 = "PRANAYGOTTIPATI@GMAIL.COM";
		String email2 = "PRANAYGOTTIPATI@GMAIL.COM";
		String email3 = "pranaygottipati@gmail.com";
		System.out.println(email1.compareTo(email2));
		System.out.println(email1.compareToIgnoreCase(email3));
	}
}
