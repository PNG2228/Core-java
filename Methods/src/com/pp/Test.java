package com.pp;
public class Test { 
	public static void main(String[] args) {
Sample obj = new Sample();
int value = 15;
System.out.println("Before calling changeX "+value);
obj.changeX(value);
System.out.println("After calling changeX "+value);

Employee emp = new Employee();
emp.name = "Kwaja baba";
emp.age =14;
emp.salary =75000.00;
System.out.println("Before calling changeEmployee");
emp.getDetails();
obj.changeEmployee(emp);
System.out.println("After calling changeEmployee");
emp.getDetails();
}
}