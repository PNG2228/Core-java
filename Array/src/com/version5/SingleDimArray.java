package com.version5;

import java.util.Scanner;

public class SingleDimArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.print("Enter value at index"+i);
			a[i]=sc.nextInt();
		}
		
		System.out.println();
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
