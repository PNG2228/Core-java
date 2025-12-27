package com.version5;
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
			Employee obj1 = new Employee(101,"Pranay",35000.0);
			
			Employee obj2 = obj1;
			obj1.getDetails();
			obj2.getDetails();
			System.out.println("After changing obj2");
			obj2.id = 102;
			obj1.getDetails();
			obj2.getDetails();
		}
}


