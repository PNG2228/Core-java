package com.version4;
public class Employee {
		int id;
		String name;
		double salary;
		public Employee() { 
			this(10,"Pranay");
			System.out.println("No parameter constructor");
		}
		public Employee(int x,String y,double z) {
			System.out.println("3 parameter constructor");
		}
		public Employee(int x , String y) {
			this(10,"Pranay",12.36);
			System.out.println("2 parameter constructor");
		}
		public static void main(String[] args) {
			Employee obj = new Employee();	
		}
}