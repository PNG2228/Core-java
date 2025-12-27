package com.version3;

public class Test {

	public static void main(String[] args) {
		FoodOrder obj;
		Customer obj1 = new Customer();
		obj = new Zomato();
		obj1.getFood(obj);
		
		Customer obj2 = new Customer();
		obj = new Swiggy();
		obj2.getFood(obj);
		
		Customer obj3 = new Customer();
		obj = new KFC();
		obj3.getFood(obj);
	}

}
