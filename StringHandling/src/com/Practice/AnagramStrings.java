package com.Practice;

import java.util.*;

public class AnagramStrings {
	public static void checkAnagram(String str1,String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("\nAnagrams");
		}else {
			System.out.println("\nNot a Anagram");
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String str1 = sc.nextLine();
		System.out.println("Enter second String");
		String str2 = sc.nextLine();
		checkAnagram(str1,str2);
		sc.close();
	}
}
