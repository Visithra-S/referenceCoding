package com.cerp.oops;

public class MainnInheritance extends DemoInheritance{
//	private String modelName = "Mustang";
	public void honk() {
	    System.out.println("Parent");
	}
	public static void main(String[] args) {
		DemoInheritance maininheritance = new MainnInheritance();
		//
		DemoInheritance demoinheritance = new DemoInheritance();
		maininheritance.honk(); // Parent or Child
		demoinheritance.honk();
		//System.out.println("Model Name is: " + maininheritance.modelName);
	}

}
