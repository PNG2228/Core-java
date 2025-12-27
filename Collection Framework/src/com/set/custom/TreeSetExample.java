package com.set.custom;
import java.util.*;
public class TreeSetExample {
	public static void main(String[]args) {
		TreeSet<Employee> set = new TreeSet<Employee>();
		set.add(new Employee(101,"Dubasi Venkata kiran",75000.00));
		set.add(new Employee(501,"Arepalli Charan",65000.00));
		set.add(new Employee(111,"Bejjam Dharani",45000.00));
		set.add(new Employee(999,"Ramisetti karthik",35000.00));
		set.add(new Employee(777,"Damineni Dohal",25000.00));
		for(Employee x : set) {
			System.out.println(x);
		}
	}
}
