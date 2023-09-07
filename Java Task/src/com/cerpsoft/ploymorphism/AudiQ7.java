package com.cerpsoft.ploymorphism;

public class AudiQ7 implements VehicleI{

	@Override
	public void insertKey() {
		System.out.println("Unlock the Audi Q7.");
		run();
	}

	@Override
	public void run() {
		System.out.println("Ready to your Race with Q7...");
	}

	/*@Override
	void insertKey() {
		System.out.println("Unlock the Audi Q7.");
		run();
	}

	@Override
	public void run() {
		System.out.println("Ready to your Race with Q7...");
	}*/
}
