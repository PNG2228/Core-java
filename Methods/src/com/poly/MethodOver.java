package com.poly;

public class MethodOver {
	public void add() {
		System.out.println("No parameter method");
	}
	public void add(int a) {
		System.out.println("int parameter method");
	}
	public void add(String a) {
		System.out.println("String parameter method");
	}
	public void add(String a , int b) {
		System.out.println("String,int parameter method");
	}
	public void add(int a,String b) {
		System.out.println("int,String parameter method");
	}

}
