package com.version1;
public class StringExample10 {
	public static void main(String[] args) {
		String arr[] = {"Sai Kiran Bedi", "Sai Suneel Bedi","Sasank singh","Vara Laxmi singh","Sada siva singh", "Sai Dileep rock","Sai Charan singh",
				"Kartheek Bejjam","Sai Sathwik Bedi"};
		for(String name:arr) {
			if(name.endsWith("Bedi")) {
				System.out.println(name);
			}
		}
		for(String name:arr) {
			if(name.endsWith("singh")) {
				System.out.println(name);
			}
		}
		for(String name:arr) {
			if(name.startsWith("Sai")) {
				System.out.println(name);
			}
		}
	}
}
