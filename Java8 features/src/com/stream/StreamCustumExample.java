package com.stream;
import java.util.*;
public class StreamCustumExample {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(101,"Dubai Mani kumar",14,75000.0,"Java","Assam"));
        list.add(new Employee(201,"Gandepalli Dheeraj",3,175000.0,"Python","Hyderabad"));
        list.add(new Employee(143,"Madugula Dileep",12,155000.0,"Java","Bihar"));
        list.add(new Employee(555,"Sanaka sadha siva",5,85000.0,"Python","Assam"));
        list.add(new Employee(666,"Garre Chandu",7,95000.0,"Java","Rajasthan"));
        list.add(new Employee(777,"Gottipati Pranay",10,145000.0,"MySQL","Bangalore"));
        list.add(new Employee(888,"Ramisetti Kwaja Baba",8,95000.0,"Python","Assam"));
        list.add(new Employee(999,"Damineni Dharani",6,75000.0,"Java","Bihar"));
        list.add(new Employee(521,"Parepalli",9,115000.0,"MySQL","Bangalore"));
        list.add(new Employee(321,"Kosuri Vara Laxmi",15,195000.0,"Python","Bihar"));
        list.add(new Employee(852,"Kollipara Priya",7,85000.0,"MySQL","Rajasthan"));
        System.out.println("Employees from Bihar");
        list.stream()
            .filter(emp -> emp.getLocation().equals("Bihar"))
            .forEach(emp -> System.out.println(emp));
        System.out.println();
        System.out.println("Employees from Assam");
        list.stream()
            .filter(emp -> emp.getLocation().equals("Assam"))
            .forEach(emp -> System.out.println(emp));
        System.out.println();
        System.out.println("Employees from Java Department");
        list.stream()
            .filter(emp -> emp.getDept().equals("Java"))
            .forEach(emp -> System.out.println(emp));
        System.out.println();
        System.out.println("Employees from Bihar and Java dept:");
        list.stream()
            .filter(emp -> emp.getLocation().equals("Bihar"))
            .filter(emp -> emp.getDept().equals("Java"))
            .forEach(emp -> System.out.println(emp));
        System.out.println();
        System.out.println("Employees with experience >= 10 years");
        list.stream()
            .filter(emp -> emp.getExp() >= 10)
            .forEach(emp -> System.out.println(emp));
        System.out.println();
        System.out.println("Employees with salary >= 100000.00");
        list.stream()
            .filter(emp -> emp.getSalary() >= 100000.00)
            .forEach(emp -> System.out.println(emp));
        System.out.println();
        System.out.println("Employees sorted by ascending salary");
        list.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .forEach(emp -> System.out.println(emp));
        System.out.println();
        System.out.println("Employees sorted by ascending experience");
        list.stream()
            .sorted(Comparator.comparingInt(Employee::getExp))
            .forEach(emp -> System.out.println(emp));
    }
}
