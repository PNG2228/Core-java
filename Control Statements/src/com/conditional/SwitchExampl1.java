package com.conditional;
import java.util.Scanner;
public class SwitchExampl1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		String day = sc.next();
      
	    switch(day) {
	    case "Saturday":
	    	System.out.println("Wake up at 10 AM");
	    	break;
	    case "Sunday":
	    	System.out.println("Wake up at 10 AM");
	    	break;
	    case "Monday":
	    	System.out.println("Wake up at 6 AM");
	    	break;
	    case "Tuesday":
	    	System.out.println("Wake up at 6 AM");
	    	break;
	    case "Wednesday":
	    	System.out.println("Wake up at 6 AM");
	    	break;
	    case "Thursday":
	    	System.out.println("Wake up at 6 AM");
	    	break;
	    case "Friday":
	    	System.out.println("Wake up at 6 AM");
	    	break;
	    default:
	    	System.out.println("Hello please enter valid day");
	    	break;
	    }
	    sc.close();
	} 

}
