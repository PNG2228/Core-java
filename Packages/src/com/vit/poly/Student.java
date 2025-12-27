package com.vit.poly;
public class Student {
	int id;
	String name;
	double ssc;
	public Student(int id, String name, double ssc) {
		super();
		this.id = id;
		this.name = name;
		this.ssc = ssc;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ssc=" + ssc + "]";
	}
	
}
