package com.version1;
public class SingleDimArray {
	public static void main(String[] args) {
		int a[] =new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
        
		a[4]=10;
		a[3]=20;
		a[1]=30;
		a[0]=40;
		a[2]=50;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	}

}
