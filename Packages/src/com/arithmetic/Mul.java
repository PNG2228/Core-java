package com.arithmetic;

import com.read.Input;

public class Mul {
public void mul() {
	Input obj = new Input();
	obj.readInput();
	int c = obj.a*obj.b;
	System.out.println("Multiplication is:"+c);	
	}
}
