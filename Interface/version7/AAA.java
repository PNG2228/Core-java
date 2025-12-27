package com.version7;

public interface AAA {
	
   void show();
   
   default void display() {
	   System.out.println("Display from AAA");
   }
   
   static void clear() {
	   System.out.println("Clear from AAA");
   }
   
}
