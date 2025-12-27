package com.Practice;

public class SecondMaxMinArray {
    public static void main(String[] args) {
        int[] arr = {7, 45, 18, 54, 99, 16};
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max)
                secondMax = arr[i];
            if (arr[i] < secondMin && arr[i] > min)
                secondMin = arr[i];
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Second maximum element: " + secondMax);
        System.out.println("Minimum element: " + min);
        System.out.println("Second minimum element: " + secondMin);
    }
}

