package com.version3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer;
		computer = new Laptop();
		Developer obj1 = new Developer(computer);
		obj1.startCoding();
		computer = new Desktop();
		Developer obj2 = new Developer(computer) ;
		obj2.startCoding();

	}

}
