package com.version7;

public class Manager extends Employee{
	
	private String dop;
	

	public Manager(String id, String name, double salary,String dop) {
		super(id, name, salary);
		this.dop = dop;
	}
	
	@Override
	
	public String toString() {
		return super.toString() +" " + dop;
	}

}