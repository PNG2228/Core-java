package com.Date;
import java.util.Date;
public class DateExample1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date obj = new Date();
		System.out.println(obj);
		System.out.println(obj.getDate());
		System.out.println(obj.getMonth());
		System.out.println(obj.getDay());
		System.out.println(obj.getSeconds());
		System.out.println(obj.getMinutes());
		System.out.println(obj.getTime());
		Date obj1 = new Date(2025/9/20);
		Date obj2 = new Date(2024/8/20);
		System.out.println(obj1.after(obj2));
		System.out.println(obj1.before(obj2));
		System.out.println(obj2.before(obj1));
		System.out.println(obj2.after(obj1));
	}
}
