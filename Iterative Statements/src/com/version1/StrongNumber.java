package com.version1;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original_number = n;
        int strong = 0;
        while (n > 0) {
            int digit = n % 10;
            strong = strong + getFact(digit);
            n = n / 10;
        }
        if (original_number == strong) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a Strong number");
        }

        sc.close();
    }
    public static int getFact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
