package com.optional;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		String names[] = {"Anand Kumar",null,"Varaa laxmi Bejjam",null,"Dharani Damineni",
				"Chandu Garre",null,"Madugula Mounika",null,"Dileep Prajapathi"};
//		for(String name : names) {
//			System.out.println(name.toUpperCase());
//		}
//		for(String name : names) {
//			try {
//				System.out.println(name.toUpperCase());
//			}catch(NullPointerException e){
//				System.out.println("Null value found");
//			}
//		}
//		for(String name : names) {
//			if(name!=null) {
//			System.out.println(name.toUpperCase());
//			}else {
//				System.out.println("Null value found");
//			}
//		}
//		for(String name : names) {
//            Optional<String> x = Optional.ofNullable(name);
//            x.ifPresent(element -> System.out.println(element.toUpperCase()));
//        }
		for (String name : names) {
            Optional<String> x = Optional.ofNullable(name);
            x.ifPresentOrElse(
                element -> System.out.println(element.toUpperCase()),
                () -> System.out.println("Null value found")
            );
        }
	}
}
