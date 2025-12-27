package com.set;
import java.util.*;
public class TreeSetExample {
	public static void main(String[] args) {
		Set <String> set = new TreeSet<String>();
		set.add("Kirak Karthik");
		set.add("Ramisetti Venkata Charan");
		set.add("Kollipara Chandu");
		set.add("Dohal Prajapati");
//		set.add(null);
		set.add("Kirak Karthik");
		set.add("Ramisetti Venkata Charan");
		set.add("Kollipara Chandu");
		set.add("Dohal Prajapati");
		for(String element : set) {
			System.out.println(element);
		}
		System.out.println(set);
		System.out.println(set.contains("Dharani Bejjam"));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set.remove("Dohal Prajapathi"));
		System.out.println(set);
		set.clear();
		System.out.println(set.isEmpty());
	}
}
