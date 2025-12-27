package com.set.custom.version2;
public class Employee{
private int id;
private String name;
private double salary;
public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
@Override
public boolean equals(Object o) {
	if(o==null) {
		return false;
	}else if(this.getClass()!=o.getClass()) {
		return false;
	}else {
		Employee obj =(Employee)o;
		if(this.id==obj.id&& this.name==obj.name&& this.salary==obj.salary) {
			return true;
		}else {
			return false;
		}
	}
}
@Override
public int hashCode() {
	int hashcode = 7;
	hashcode +=id*11;
	hashcode +=name.hashCode()*3;
	hashcode +=salary*5;
	return hashcode;
}
}

