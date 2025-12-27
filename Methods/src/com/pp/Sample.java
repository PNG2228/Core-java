package com.pp;

public class Sample {
	int x;
	Employee obj;
	public void changeX(int a) {
		x=a;
		x=x+20;
		System.out.println("X valur"+x);
	}
	public void changeEmployee(Employee ref) {
		obj=ref;
		obj.age=obj.age+15;
		obj.getDetails();
	}
}
