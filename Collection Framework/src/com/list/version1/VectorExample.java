package com.list.version1;
import java.util.*;
public class VectorExample {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		list.add("Gottipati Pranay"); //0
		list.add("Manupuri Chandu"); //1
		list.add("Arepalli Karthik"); //2
		list.add("Dohal Sri"); //3
		list.add("Bejjam Dileep"); //4
		list.add("Madugula Kiran"); //5
		System.out.println(list);
		System.out.println(list.get(3));
		list.add(1,"Rock Dheeraj"); // adding new element
		System.out.println(list);
		list.set(6,"Madugula Vekata Kiran"); // modify value
		System.out.println(list);
		list.add("Gottipati Pranay"); //allows duplicate value
		list.add("Manupuri Chandu"); //allows duplicate value
		System.out.println(list);
		System.out.println(list.indexOf("Gottipati Pranay"));
		System.out.println(list.lastIndexOf("Gottipati Pranay"));
		System.out.println(list.lastIndexOf("Rockstar Kiran"));
		System.out.println(list.contains("Kirak Karthik"));
		list.addFirst("Dohal Prajapathi");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.remove(4);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		list.clear(); //all elements will be deleted
		System.out.println(list.isEmpty());
	}
}
