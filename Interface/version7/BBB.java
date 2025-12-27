package com.version7;

public interface BBB {
	
	void show();
	
	default void display() {
		   System.out.println("Display from BBB");
	}
	
	static void clear() {
		   System.out.println("Clear from BBB");
    }

}
