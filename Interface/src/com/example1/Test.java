package com.example1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Walkable obj1 = (Walkable) new Human();
		Jumpable obj2 = (Jumpable) new Human();
		Swimmable obj3 = (Swimmable) new Human();
		
		obj1.walk();
		obj2.jump();
		obj3.swim();
		
		Flyable obj4 = (Flyable) new Parrot();
		Jumpable obj5 = (Jumpable) new Parrot();
		Walkable obj6 = (Walkable) new Parrot();
		
		obj4.fly();
		obj5.jump();
		obj6.walk();
		
		Swimmable obj7 = (Swimmable) new Dog();
		Walkable obj8 = (Walkable) new Dog();
		Jumpable obj9 = (Jumpable) new Dog();
		
		obj7.swim();
		obj8.walk();
		obj9.jump();
		
		Swimmable obj10 = (Swimmable) new Frog();
		Walkable obj11 = (Walkable) new Frog();
		Jumpable obj12 = (Jumpable) new Frog();
		
		obj10.swim();
		obj11.walk();
		obj12.jump();
		
		Swimmable obj13 = (Swimmable) new Fish();
		obj13.swim();
		
		Swimmable obj14 = (Swimmable) new Cat();
		Walkable obj15 = (Walkable) new Cat();
		Jumpable obj16 = (Jumpable) new Cat();
		
		obj14.swim();
		obj15.walk();
		obj16.jump();

	}

}
