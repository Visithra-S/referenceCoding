package com.cerpsoft.ploymorphism;

public class BMWX1 implements VehicleI{

	@Override
	public void insertKey() {
		System.out.println("Welcome to X1.");
		run();		
	}

	@Override
	public void run() {
		System.out.println("All the Best. Safe to Drive with BMW X1...");
	}

	/*@Override
	void insertKey() {
		System.out.println("Welcome to X1.");
		run();
	}

	@Override
	public void run() {
		System.out.println("All the Best. Safe to Drive with BMW X1...");
	}*/
	
}
