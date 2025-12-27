package com.cg.variable;
public class Circle {
   double radius;
   final static double PI = 3.14;
   public void printArea() {
	   double Area = PI*radius*radius; // Local Variable
	   System.out.println("Area is"+Area);
   }
   public void printPerimeter() {
	   double pm = 2*PI*radius; // Local Variable
	   System.out.println("Perimeter is"+pm);
   }
public static void main(String[]args) {
	 Circle obj = new Circle();
	 obj.radius=3;
	 obj.printArea();
	 obj.printPerimeter();
}
}
