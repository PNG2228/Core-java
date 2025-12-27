package com.version1;
public class Customer {
	public void getFood(Zomato obj) {
		obj.zomatoOrder();
	}
	public void getFood(Swiggy obj) {
		obj.SwiggyOrder();
	}
	public void getFood(KFC obj) {
		obj.KFCOrder();
	}
}
