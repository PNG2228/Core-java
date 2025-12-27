package com.map;

import java.util.*;

public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		String name = "Gandepalli veera venkata kanaka maha parepalli chandu";
		char arr[]= name.toCharArray();
		Map<Character,Integer>map = new LinkedHashMap<Character,Integer>();
		for(char ch:arr) {
			map.put(ch, map.getOrDefault((ch),0)+1);
		}
		System.out.println(map);
	}
}
