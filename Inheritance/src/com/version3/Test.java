package com.version3;

public class Test {

    public static void main(String[] args) {

        Manager obj = new Manager("ID110", "Pranay", 85000.00);

        obj.getDetails();

        System.out.println(obj.bonus());
    }
}
