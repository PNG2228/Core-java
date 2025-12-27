package com.version5;

public class Consumer extends Thread {
	private CubbyHole cb;

	public Consumer(CubbyHole cb) {
		this.cb = cb;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			int item = cb.get();
			System.out.println("Consumed item number:"+item);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}