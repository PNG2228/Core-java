package com.version1;
public class Employee {
		private int id;
		private String name;
		private double salary;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public static void main(String[] args) {
			Employee obj = new Employee();
			obj.setId(101);
			obj.setName("Pranay");
			obj.setSalary(35000);
			System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getSalary());
		}
}


