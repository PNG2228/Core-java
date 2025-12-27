package com.version8;
import java.util.Scanner;
public class Test {
	 public static void main(String[] args) {
	    	Employee obj1 = new Employee("ID111","Anand",25000.00);
	    	Employee obj2 = new Employee("ID111","Anand",25000.00);
	    	System.out.println(obj1.equals(obj2));
	    	System.out.println(obj1.equals(null));
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println(obj1.equals(sc));
	    }
}
