package com.version3;
public class Employee {
		int id;
		String name;
		double salary;
		public Employee(int id,String name,double salary) {
			this.id=id;
			this.name = name;
			this.salary = salary;
		}
		public void getDetails() {
			System.out.println(id+" "+name+" "+salary);
		}
		public static void main(String[] args) {
			Employee obj = new Employee(101,"Pranay",35000.0);
			obj.getDetails();
		}
}


