package com.NumberPattern;
import java.util.Scanner;
public class DecreasingNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of lines:");
        int N = scanner.nextInt();
        scanner.close();

        for (int i = N; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}