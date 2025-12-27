package com.Practice;

public class ArraySumProduct {
    public static void main(String[] args) {
        int[] arr = {7,18,45,1};

        int sum = 0;
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
        }

        System.out.println("Sum of elements: " + sum);
        System.out.println("Product of elements: " + product);
    }
}
