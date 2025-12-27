package com.map;
import java.util.*;
public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("22BCE8680","Pranay Gottipati");
		map.put("22BCE8951","Nripesh Katragadda");
		map.put("22BCE20272","Bunty Yarragunta");
		map.put("22BCE7222","Anudeep");
		map.put(null,"Pranay");
		map.put(null,"bunty");
		map.put("22BCE8854",null);
		map.put("22BCE202350",null);
		map.put("22BCE8680","Gottipati Pranay");
		System.out.print(map);
		Set <String> keys = map.keySet();
		for(String key:keys) {
			System.out.println(key+" ");
		}
		System.out.println();
		Collection<String> values = map.keySet();
		for(String value:values) {
			System.out.println(value+" ");
		}
		System.out.println();
		System.out.println(map.containsKey("22BCE8800"));
		System.out.println(map.containsValue("Pranay Gottipati"));
		System.out.println(map.get("22BCE8680"));
		System.out.println(map.get("22BCE8780"));
		System.out.println(map.replace("22BCE20272","Yarragunta Bunty"));
		System.out.println(map.remove("22BCE8680"));
		map.clear();
		System.out.println(map.isEmpty());
	}
}
