package com.vit.ug;
public class Student {
	int id;
	String name;
	double ssc;
	double inter;
	public Student(int id, String name, double ssc, double inter) {
		super();
		this.id = id;
		this.name = name;
		this.ssc = ssc;
		this.inter = inter;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ssc=" + ssc + ", inter=" + inter + "]";
	}
	
}
