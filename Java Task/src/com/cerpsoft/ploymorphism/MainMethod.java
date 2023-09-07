package com.cerpsoft.ploymorphism;

public class MainMethod {
	
	public static void main(String[] args) {
		
		VehicleI q7 = new AudiQ7();
		q7.insertKey();
		
		VehicleI bmwx1 = new BMWX1();
		bmwx1.insertKey();
	}
}