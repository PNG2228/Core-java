package com.version7;

public class CCC implements AAA, BBB{

	@Override
	public void show() {
	    System.out.println("Show from CCC");
	}

	@Override
	public void display() {
		AAA.super.display();
		BBB.super.display();
		System.out.println("Display from CCC");
	}

}