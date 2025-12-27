package com.version1;
public class StringExample9 {
	public static void main(String[] args) {
		String str = "Java Language Java Programming Language";
		System.out.println(str.indexOf("Java"));
		System.out.println(str.lastIndexOf("Java"));
		System.out.println(str.indexOf("Programming"));
		System.out.println(str.lastIndexOf("Programming"));
		String arr[] = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(str.indexOf(arr[i])==str.lastIndexOf(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
}
