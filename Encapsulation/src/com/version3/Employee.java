package com.version3;
public class Employee {
		private int id;
		private String name;
		private double salary;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			if(id<100) {
				System.out.println("Invalid id");
				System.exit(0);
			}else {
			this.id = id;
			}
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			if(name==null) {
				System.out.println("Invalid name");
				System.exit(0);
			}else {
			this.name = name;
			}
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			if(salary <25000.00) {
				System.out.println("Invalid salary");
				System.exit(0);
			}else {
			this.salary = salary;
			}
		}
		public static void main(String[] args) {
			Employee obj = new Employee();
			obj.setId(101);
			obj.setName("Pranay");
			obj.setSalary(15000.00);
			System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getSalary());
		}
}


