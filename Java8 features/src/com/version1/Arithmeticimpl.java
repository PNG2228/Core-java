package com.version1;
public class Arithmeticimpl {
	public static int doOperation(Arithmetic obj,int x,int y) {
		return obj.operation(x,y);
	}
	public static void main(String[]args) {
		int result = Arithmeticimpl.doOperation((a,b) -> {return a+b;},15,10);
		System.out.println(result);
		result = Arithmeticimpl.doOperation((a,b) -> {return (a-b)*(b-a);},15,10);
		System.out.println(result);
	    result = Arithmeticimpl.doOperation((a,b) -> {return (int)(Math.pow(a,3)-Math.pow(b,3));},15,10);
		System.out.println(result);
	}
}
