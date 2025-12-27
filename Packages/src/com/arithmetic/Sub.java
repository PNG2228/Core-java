package com.arithmetic;

import com.read.Input;

public class Sub {
public void sub() {
	Input obj = new Input();
	obj.readInput();
	int c = obj.a-obj.b;
	System.out.println("Subtraction is:"+c);	
	}
}
