package com.version5;
public class CubbyHole {
	private int item;
	private boolean available;
	public synchronized void put(int item) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.item = item;
		available = true;
		notifyAll();
	}
	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		available = false;
		notifyAll();
		return item;
	}
}