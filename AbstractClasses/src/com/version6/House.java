package com.version6;
public abstract class  House {
	public final void buildBasment() {
		System.out.println("Basment is build by concrete");
	}
	public  abstract void buildWallsAndPillars();
	public final void buildWindows() {
		System.out.println("Windows Made with glass");
	}
}
