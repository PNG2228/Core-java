package com.version1;
public class TrimToSizeExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.ensureCapacity(50);
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}
