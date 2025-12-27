package com.vit.pg;
public class Student {
	int id;
	String name;
	double ssc;
	double inter;
	double ug;
	public Student(int id, String name, double ssc, double inter, double ug) {
		super();
		this.id = id;
		this.name = name;
		this.ssc = ssc;
		this.inter = inter;
		this.ug = ug;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ssc=" + ssc + ", inter=" + inter + ", ug=" + ug + "]";
	}
	
}
