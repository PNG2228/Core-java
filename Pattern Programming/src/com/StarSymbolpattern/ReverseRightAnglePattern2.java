package com.StarSymbolpattern;
import java.util.Scanner;
public class ReverseRightAnglePattern2 {
	public static void rightAnglePattern(int lines) {
		for(int i=lines;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=lines;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines in pattern");
		int lines = sc.nextInt();
		rightAnglePattern(lines);
        sc.close();
	}
}
