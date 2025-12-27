package com.version5;

public interface University {
	
     void infra();
     default void questionpaper() {
    	 System.out.println("QP from University");
     }
     static void sFRatio() {
    	 System.out.println("20(Students) : 1(Faculty)");
     }
     
}