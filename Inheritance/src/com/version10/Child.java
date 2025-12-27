package com.version10;
public class Child extends Parent {
	@Override
	public void show() {
		System.out.println("Show from child");
	}
	@Override
	public void display() {
       // Cannot override the final method from Parent		
	}
}
