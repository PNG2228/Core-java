package com.cg.variable;
public class SimpleInterest {
    public static void main(String[] args) {
        double P = 1000; // Principal
        double R = 5;    // Rate
        double T = 2;    // Time
        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest = " + SI);
    }
}
