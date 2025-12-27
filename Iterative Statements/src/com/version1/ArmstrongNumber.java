package com.version1;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int original_number = n;
        int digits = countDigits(n);
        int armstrong = 0;
        while (n > 0) {
            int digit = n % 10;
            armstrong += Math.pow(digit, digits);
            n = n / 10;
        }
        if (original_number == armstrong) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}