package com.cg.variable;
public class BMI {
    public static void main(String[] args) {
        double weight = 70;   // in kg
        double height = 1.75; // in meters
        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);
    }
}
