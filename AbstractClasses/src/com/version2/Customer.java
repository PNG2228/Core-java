package com.version2;
public class Customer {
	public void getFood(FoodOrder obj) {
		if(obj instanceof Zomato) {
			((Zomato)obj).zomatoOrder();
		}else if(obj instanceof Swiggy) {
			((Swiggy)obj).SwiggyOrder();
		}else if(obj instanceof KFC) {
			((KFC)obj).KFCOrder();
		}
	}
}
