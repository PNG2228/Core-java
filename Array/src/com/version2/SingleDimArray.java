package com.version2;
public class SingleDimArray {
	public static void main(String[] args) {
		int a[] =new int[5];
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
        
		System.out.println();
		
		a[4]=10;
		a[3]=20;
		a[1]=30;
		a[0]=40;
		a[2]=50;
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
