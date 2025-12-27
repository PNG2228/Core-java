package com.version7;

public class Employee {
	
	private String id;
	private String name;
	private double salary;

	public Employee(String id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}
	
	
}