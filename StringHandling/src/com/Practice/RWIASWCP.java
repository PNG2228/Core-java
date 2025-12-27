package com.Practice;

import java.util.Scanner;

public class RWIASWCP {
	public static void reverseString(String str) {
		String arr[] = str.split(" ");
		StringBuffer revString = new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			StringBuffer sb = new StringBuffer(arr[i]);
			sb.reverse();
			revString.append(sb);
			if(i!=arr.length-1) {
				revString.append(" ");
			}
		}
		System.out.println(revString);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		reverseString(str);
		sc.close();
	}
}
