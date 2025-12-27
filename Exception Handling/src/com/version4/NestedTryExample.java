package com.version4;
public class NestedTryExample {
	public static void main(String[] args) {
		String names[] = {"Pranay Gottipati","Dheeraj Kollipara",null,"Bejjam Karthik",null,
				"Dharani Gandepalli",null,"Dileep 143",null};
		for(String name:names) {
		try {
			name = name.toUpperCase();
			System.out.println(name);
			try {
			char ch = name.charAt(12);
			System.out.println(ch);
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("No 12th index");
			}
		  }
		catch(NullPointerException e) {
			System.out.println("Null value found");
		}
		}
	}
}
