package com.conditional;
import java.util.Scanner;
public class SwitchExampl5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		String day = sc.next();
		String result=" ";
      
	    switch(day) {
	    case "Saturday","Sunday" -> result ="Wake up at 10 AM";

	    case "Monday","Tuesday","Wednesday","Thursday","Friday" -> result ="Wake up at 6 AM";
	 
	    default -> result ="Hello please enter valid day";
	    	
	    }
	    System.out.println(result);
	    sc.close();
	} 
}
