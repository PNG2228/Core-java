package com.custom.version2;
class RadiusException extends Exception {
    public RadiusException(String msg) {
        super(msg);
    }
}
public class Circle {
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public void getArea() {
        try {
            if (radius < 0.0) {
                throw new RadiusException("Invalid Radius");
            }
            double area = PI * radius * radius;
            System.out.println("Area is " + area);
        } catch (RadiusException e) {
            System.out.println("Please enter positive radius value");
        }
    }
    public void getPerimeter() {
        try {
            if (radius < 0.0) {
                throw new RadiusException("Invalid Radius");
            }
            double pm = 2 * PI * radius;
            System.out.println("Perimeter is " + pm);
        } catch (RadiusException e) {
            System.out.println("Please enter positive radius value");
        }
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
