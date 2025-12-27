package com.Practice;

import java.util.Scanner;

public class Pangram {
    public static void checkPangram(String str) {
        str = str.toLowerCase();
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        boolean isPangram = true;
        for (int i = 0; i < alphabets.length(); i++) {
            char ch = alphabets.charAt(i);
            if (!str.contains(String.valueOf(ch))) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("\nPangram String");
        } else {
            System.out.println("\nNot a Pangram String");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        checkPangram(str);
        sc.close();
    }
}
