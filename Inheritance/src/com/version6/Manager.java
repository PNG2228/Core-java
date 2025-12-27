package com.version6;

public class Manager extends Employee{
	
	private String dop;
	

	public String getDop() {
		return dop;
	}

	public void setDop(String dop) {
		this.dop = dop;
	}

	public Manager(String id, String name, double salary,String dop) {
		super(id, name, salary);
		this.dop = dop;
	}
	
	public double bonus() {
		return super.bonus()*2;
		
	}

}