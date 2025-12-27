package com.example1;

public class Parrot implements Flyable, Walkable, Jumpable {

	@Override
	public void jump() {
		
		System.out.println("Parrot can Jump");
		
	}

	@Override
	public void walk() {
		
		System.out.println("Parrot can walk");
		
	}

	@Override
	public void fly() {
		
		System.out.println("Parrot can Fly");
		
	}

}