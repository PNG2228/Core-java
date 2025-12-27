package com.Practice;
public class ArraysSort {
	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int temp =0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
		            arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {96,-85,74,-1,5,777,-555,963,143};
		sort(arr);
        System.out.println("After sorting");
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
