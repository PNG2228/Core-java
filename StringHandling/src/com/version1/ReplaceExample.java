package com.version1;
public class ReplaceExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Good Evening");
        sb.replace(5, 12, "Morning");
        System.out.println(sb);
    }
}
