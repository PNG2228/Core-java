package com.map;
import java.util.*;
public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
		map.put("22BCE8680","Pranay Gottipati");
		map.put("22BCE8951","Nripesh Katragadda");
		map.put("22BCE20272","Bunty Yarragunta");
		map.put("22BCE7222","Anudeep");
        System.out.println(map);
        for(Map.Entry<String,String>entry:map.entrySet()) {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
	}
}
