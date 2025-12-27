package com.pack2;

import com.pack1.Sample;

public class PackTest extends Sample{
	public static void main(String[] args) {
		PackTest obj = new PackTest();
		//obj.show(); not accessible
		//obj.c+ear(); not accessible
		obj.ok();
		obj.cancel();
	}
}
