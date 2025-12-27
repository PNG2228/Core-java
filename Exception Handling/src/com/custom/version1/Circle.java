package com.custom.version1;
public class Circle {
	private static final double PI = 3.14;
	private double radius;
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public void getArea() {
		double area = PI *radius*radius;
		System.out.println("Area is "+area);
	}
	public void getPerimeter() {
		double pm = 2*PI*radius;
		System.out.println("Perimeter is "+pm);
	}
	public static void main(String[] args) {
		Circle obj1 = new Circle(5.25);
		obj1.getArea();
		obj1.getPerimeter();
		Circle obj2 = new Circle(-4.75);
		obj2.getArea();
		obj2.getPerimeter();
	}
}
