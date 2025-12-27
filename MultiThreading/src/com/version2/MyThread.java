package com.version2;
public class MyThread extends Thread{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" executing");
	}
	public static void main(String[]args) {
		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();
		MyThread obj3 = new MyThread();
		obj1.setName("Pranay");
		obj2.setName("Dohal");
		obj3.setName("Dheeraj");
		obj1.start();
		obj2.start();
		obj3.start();
}
}
