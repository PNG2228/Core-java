package com.Practice;

import java.util.Scanner;

public class CombinationOfCharacters {
    public static void combination(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int maxlength = Math.max(length1, length2);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < maxlength; i++) {
            if (i < str1.length()) {
                sb.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                sb.append(str2.charAt(i));
            }
        }

        System.out.println("Combined String: " + sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String:");
        String str1 = sc.nextLine();
        System.out.println("Enter second String:");
        String str2 = sc.nextLine();
        combination(str1, str2);
        sc.close();
    }
}

