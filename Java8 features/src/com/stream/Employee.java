package com.stream;
public class Employee {
	private int id;
	private String name;
	private int exp;
	private double salary;
	private String dept;
	private String location;
	public Employee(int id, String name, int exp, double salary, String dept, String location) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.salary = salary;
		this.dept = dept;
		this.location = location;
	}
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
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", exp=" + exp + ", salary=" + salary + ", dept=" + dept
				+ ", location=" + location + "]";
	}
}
