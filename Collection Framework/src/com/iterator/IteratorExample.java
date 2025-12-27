package com.iterator;
import java.util.*;
public class IteratorExample {
	public static void main(String[] args) {
		String names[] = {"Anand","Dheeraj","Dohal","Karthik","Shannu","Prathyusha"};
		List<String> list = Arrays.asList(names);
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
