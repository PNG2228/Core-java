package com.pack2;
import com.pack1.Sample;
public class Test {
	public static void main(String[]args) {
		Sample obj = new Sample();
		//obj.show(); Not accessible
		//obj.clear(); Not accessible
		//obj.ok(); Not accessible
		obj.cancel();
	}
}
