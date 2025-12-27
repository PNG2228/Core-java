package com.set.custom.version2;
import java.util.*;
public class HashSetExample {
	public static void main(String[]args) {
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(new Employee(101,"Dubasi Venkata kiran",75000.00));
		set.add(new Employee(501,"Arepalli Charan",65000.00));
		set.add(new Employee(111,"Bejjam Dharani",45000.00));
		set.add(new Employee(999,"Ramisetti karthik",35000.00));
		set.add(new Employee(777,"Damineni Dohal",25000.00));
		set.add(new Employee(101,"Dubasi Venkata kiran",75000.00));
		set.add(new Employee(501,"Arepalli Charan",65000.00));
		set.add(new Employee(111,"Bejjam Dharani",45000.00));
		set.add(new Employee(999,"Ramisetti karthik",35000.00));
		set.add(new Employee(777,"Damineni Dohal",25000.00));
		for(Employee x : set) {
			System.out.print(x);
		}
		
	}
}
