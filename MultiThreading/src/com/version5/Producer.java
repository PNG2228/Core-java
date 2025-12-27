package com.version5;

public class Producer extends Thread {
	private CubbyHole cb;

	public Producer(CubbyHole cb) {
		this.cb = cb;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			cb.put(i);
			System.out.println("Inserted item number:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}