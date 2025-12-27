package com.conditional;
import java.util.Scanner;
public class SwitchExampl6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		String day = sc.next();
		String result=" ";
      
	    result = switch(day) {
	    case "Saturday","Sunday" -> "Wake up at 10 AM";

	    case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "Wake up at 6 AM";
	 
	    default -> "Hello please enter valid day";
	    	
	    };
	    System.out.println(result);
	    sc.close();
	} 
}
