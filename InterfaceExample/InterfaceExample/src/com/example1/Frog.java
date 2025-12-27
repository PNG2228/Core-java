package com.example1;

public class Frog implements Walkable, Jumpable, Swimmable  {

	@Override
	public void swim() {
		
		System.out.println("Frog can Swim");
		
	}

	@Override
	public void jump() {
		
		System.out.println("Frog can Jump");
		
	}

	@Override
	public void walk() {
		
		System.out.println("Frog can Walk");
		
	}

}
