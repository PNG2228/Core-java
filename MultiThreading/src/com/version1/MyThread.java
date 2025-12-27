package com.version1;
public class MyThread implements Runnable{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name+" executing");
	}
	public static void main(String[]args) {
		MyThread obj = new MyThread();
		Thread t1 = new Thread(obj, "Pranay");
		Thread t2 = new Thread(obj, "Dohal");
		Thread t3 = new Thread(obj, "Dheeraj");
		t1.start();
		t2.start();
		t3.start();
}
}
