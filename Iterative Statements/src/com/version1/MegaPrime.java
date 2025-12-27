package com.version1;
import java.util.Scanner;
public class MegaPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPrime(num) && allDigitsPrime(num))
            System.out.println(num + " is a Mega Prime number");
        else
            System.out.println(num + " is not a Mega Prime number");
        sc.close();
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    public static boolean allDigitsPrime(int n) {
        while (n > 0) {
            int d = n % 10;
            if (!(d == 2 || d == 3 || d == 5 || d == 7))
                return false;
            n /= 10;
        }
        return true;
    }
}
