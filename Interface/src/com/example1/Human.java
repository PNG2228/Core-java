package com.example1;

public class Human implements Walkable, Jumpable, Swimmable {

	@Override
	public void swim() {
		
		System.out.println("Human Can Swim");
		
	}

	@Override
	public void jump() {
		
		System.out.println("Human can Jump");
		
	}

	@Override
	public void walk() {
		
		System.out.println("Human can Walk");
		
	}

}