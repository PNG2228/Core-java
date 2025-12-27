package com.conditional;
import java.util.Scanner;
public class SwitchExampl7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		String day = sc.next();
		String result=" ";
      
	    result = switch(day) {
	    case "Saturday","Sunday" :yield "Wake up at 10 AM";

	    case "Monday","Tuesday","Wednesday","Thursday","Friday" :yield "Wake up at 6 AM";
	 
	    default :yield "Hello please enter valid day";
	    	
	    };
	    System.out.println(result);
	    sc.close();
	} 
}
