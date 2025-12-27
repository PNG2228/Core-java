package com.version1;
public class InsertBeginningExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("World");
        sb.insert(0, "Hello ");
        System.out.println(sb);
    }
}
