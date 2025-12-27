package com.example1;

public class Cat implements Walkable, Jumpable, Swimmable {

	@Override
	public void swim() {
		
		System.out.println("Cat can Swim");
		
	}

	@Override
	public void jump() {
		
		System.out.println("Cat can Jump");
		
	}

	@Override
	public void walk() {
		
		System.out.println("Cat can Walk");
		
	}

}
