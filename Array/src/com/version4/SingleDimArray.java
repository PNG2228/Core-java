package com.version4;
public class SingleDimArray {
	public static void main(String[] args) {
		int a[] = new int[]{10,20,30,40,40,50,50,60,60,70};
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
