package com.version1;
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int rev=0;
		int  original_number = n;
		while(n>0) {
			int digit = n%10;
			rev = rev*10+digit;
			n= n/10;
		}
		if(original_number==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		System.out.println(rev);
		sc.close();
	}
}
