package com.list.version1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample3 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(41);
		list1.add(143);
		list1.add(-143);
		list1.add(700);
		Collections.sort(list1);
		Collections.reverse(list1);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(list1);
		System.out.println(list1);
		System.out.println(list2);
		for(int x:list1) {
			System.out.println(x);
		}
	}
}
