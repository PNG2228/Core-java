package com.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
	public static void main(String[] args) {
		Date obj = new Date();
		DateFormat format1 = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String df1 = format1.format(obj);
		System.out.println(df1);
		DateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
		String df2 = format2.format(obj);
		System.out.println(df2);
		DateFormat format3 = new SimpleDateFormat("dd MMM yyyy");
		String df3 = format3.format(obj);
		System.out.println(df3);
		DateFormat format4 = new SimpleDateFormat("dd MMMM yyyy");
		String df4 = format4.format(obj);
		System.out.println(df4);
		DateFormat format5 = new SimpleDateFormat("EEEE dd MMMM yyyy");
		String df5 = format5.format(obj);
		System.out.println(df5);
	}
}
