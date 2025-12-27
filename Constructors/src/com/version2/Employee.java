package com.version2;
public class Employee {
		int id;
		String name;
		double salary;
		public Employee() { // user defined default constructor
			System.out.println("Object created");
		}
		public Employee(int x,String y,double z) {
			id=x;
			name = y;
			salary = z;
		}
		public Employee(int x , String y) {
			id =x;
			name =y;
		}
		public void getDetails() {
			System.out.println(id+" "+name+" "+salary);
		}
		public static void main(String[] args) {
			Employee obj1 = new Employee();
			Employee obj2 = new Employee(101,"Anand",35000.0);
			Employee obj3 = new Employee(102,"Pranay");
			obj1.getDetails();
			obj2.getDetails();
			obj3.getDetails();
		}
}


