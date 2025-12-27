package com.pack1;
public class Sample {
	@SuppressWarnings("unused")
	private void show() {
		//cancel(); accessible
		System.out.println("Private Show");
	}
	void clear() {
		//show(); accessible
		System.out.println("Default clear");
	}
	protected void ok() {
		//clear(); accessible
		System.out.println("Protected ok");
	}
	public void cancel() {
		//ok(); accessible
		System.out.println("Public Cancel");
	}
}
