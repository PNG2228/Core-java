package com.version1;

public class Test {

	public static void main(String[] args) {
		Customer obj1 = new Customer();
		obj1.getFood(new Zomato());
		
		Customer obj2 = new Customer();
		obj2.getFood(new Swiggy());
		
		Customer obj3 = new Customer();
		obj3.getFood(new KFC());
	}

}
