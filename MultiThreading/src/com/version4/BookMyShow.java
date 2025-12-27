package com.version4;
public class BookMyShow implements Runnable{
	private int available = 1;
	private int wanted;
	public BookMyShow(int wanted) {
		super();
		this.wanted = wanted;
	}
	@Override
	public void run() {
		synchronized(this) {
			String name = Thread.currentThread().getName();
			if(wanted<=10) {
				System.out.println("Ticket is booked for "+name);
				available = available - wanted;
			}else {
				System.out.println("Sorry no tickets for "+name);
			}
		}
	}
	public static void main(String[] args) {
		BookMyShow obj = new BookMyShow(1);
		Thread t1 = new Thread(obj,"Pranay");
		Thread t2 = new Thread(obj,"Dohal");
		Thread t3 = new Thread(obj,"Dheeraj");
		t1.start();
		t2.start();
		t3.start();
	}
}
