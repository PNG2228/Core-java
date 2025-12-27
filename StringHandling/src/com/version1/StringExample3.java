package com.version1;
public class StringExample3 {
	public static void main(String[]args) {
		String str = "Pranay Prabhas Dhoni Messi";
		int length = str.length(); // characters length
		System.out.println(length);
		String arr[] = str.split(" ");// words length
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
