package com.assertions;
public class Factorial {
	public static int getFact(int number) {
		assert number >=0 : "Neagtive nummber not allowed";
				if(number==1||number==0) {
					return 1;
				}else {
					return number*getFact(number-1);
				}
	}
}
