package com.version1;
public class InsertEndExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(sb.length(), " World");
        System.out.println(sb);
    }
}
