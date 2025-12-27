package com.conditional;
import java.util.Scanner;
public class SwitchExampl3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		String day = sc.next();
      
	    switch(day) {
	    case "Saturday","Sunday":
	    	System.out.println("Wake up at 10 AM");

	    case "Monday","Tuesday","Wednesday","Thursday","Friday":
	    	System.out.println("Wake up at 6 AM");
	 
	    default:
	    	System.out.println("Hello please enter valid day");
	    	
	    }
	    sc.close();
	} 

}
