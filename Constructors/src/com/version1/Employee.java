package com.version1;
public class Employee {
		int id;
		String name;
		double salary;
		public Employee() { // user defined default constructor
			System.out.println("Object created");
		}
		public void getDetails() {
			System.out.println(id+" "+name+" "+salary);
		}
		public static void main(String[] args) {
			Employee obj = new Employee();
			obj.getDetails();
		}
}


