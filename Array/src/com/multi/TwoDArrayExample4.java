package com.multi;

import java.util.Scanner;

public class TwoDArrayExample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
	    arr[0] = new int[]{10,20,30};
	    arr[1] = new int[]{40,50,60};
	    arr[2] = new int[]{70,80,90};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
     sc.close();
	}

}
