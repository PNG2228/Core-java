package com.list.version1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(100);
		list1.add(41);
		list1.add(143);
		list1.add(-143);
		list1.add(700);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(list1);
		System.out.println(list1);
		System.out.println(list2);
	}
}
