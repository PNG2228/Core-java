package com.version6;

public class Test {

    public static void main(String[] args) {

        Employee obj = new Manager("ID110", "Pranay", 85000.00,"12/10/2025"); //Up casting
        System.out.println(((Manager)obj).getDop()); // Here the employee obj is behaving like manager(p - c) There fore it is down casting

        obj.getDetails();

        System.out.println(obj.bonus());
    }
}