package com.conditional;
import java.util.Scanner;
public class ElseIfLadder {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter percentage");
        double per = sc.nextDouble();
        if(per >=0.0 & per <=100.00) {
        	if(per >= 90) {
        		System.out.println("O grade");
        	}else if(per>=80){
        		System.out.println("A grade");
        	}else if(per>=75) {
        		System.out.println("B grade");
        	}else if(per>=60) {
        		System.out.println("C grade");
        	}else if(per>=45) {
        		System.out.println("D grade");
        	}else {
        		System.out.println("Failed...");
        	}
        }else {
        	System.out.println("Please enter valid percentage");
        }
        sc.close();
	}
}
