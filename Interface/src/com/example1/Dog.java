package com.example1;

public class Dog implements Walkable, Jumpable, Swimmable  {

	@Override
	public void swim() {
		
		System.out.println("Dog can Swim");
		
	}

	@Override
	public void jump() {
		
		System.out.println("Dog can Jump");
		
	}

	@Override
	public void walk() {
		
		System.out.println("Dog can Walk");
		
	}

}
