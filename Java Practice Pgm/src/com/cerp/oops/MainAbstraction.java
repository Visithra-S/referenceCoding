package com.cerp.oops;

public class MainAbstraction extends DemoAbstraction {
	@Override
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	public static void main(String[] args) {
		MainAbstraction myabs = new MainAbstraction();
		myabs.animalSound();
		myabs.sleep();
	}	
}
