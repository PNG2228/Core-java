package com.version5;

public class Test {

    public static void main(String[] args) {

        Employee obj = new Manager("ID110", "Pranay"+ "", 85000.00); //Up casting
        ((Manager) obj).setDop("12/10/2025");
        System.out.println(((Manager)obj).getDop()); // Here the employee obj is behaving like manager(p - c) There fore it is down casting

        obj.getDetails();

        System.out.println(obj.bonus());
    }
}