package com.version2;
public class ArrayFilter {
	public static void doFilter(Filter obj,int arr[]) {
		for(int x:arr) {
			if(obj.filter(x)) {
				System.out.print(x+" ");
			}
		}
	}
	public static void main(String[]args) {
		int arr[] = {14,-77,80,-111,60,259,121,-444,-999,777,56,129,420,143,963};
		ArrayFilter.doFilter((element) -> {return element >=0;},arr);
		System.out.println();
		ArrayFilter.doFilter((element) -> {return element%7==0;},arr);
		System.out.println();
		ArrayFilter.doFilter((element) -> {return (element%7==0)&&(element%11==0);},arr);
		System.out.println();
	}
}
