package com.version1;
public class StringBuilderExample1 {
	public static void main(String[]args) {
		StringBuffer sb = new StringBuffer("Gottipati Pranay");
		sb.delete(0,10);
		System.out.println(sb);
	    sb = new StringBuffer("Pranay Gottipati");
		sb.delete(7,16);
		System.out.println(sb);
	}
}
