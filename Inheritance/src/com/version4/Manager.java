package com.version4;

public class Manager extends Employee{

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
	}
	
	public double bonus() {
		return super.bonus()*2;
		
	}

}