package com.arithmetic;

import com.read.Input;

public class Add {
	public void add() {
		Input obj = new Input();
		obj.readInput();
		int c = obj.a+obj.b;
		System.out.println("Addition is:"+c);
	}
}
