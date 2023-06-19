package com.cerp.polymorphism;

public class MainMethod extends AbstractClass{
	
	MainMethod(){
		System.out.println("inside the cons method");
	}
	
	{
		test();
		System.out.println("inside the visi method");
	}

	public static void main(String[] args) {
		
		MainMethod mainMethod = new MainMethod();
		mainMethod.show();
		mainMethod.display();
	}

	@Override
	public void display() {
		System.out.println("inside the display method");
	}

	public void test() {
		System.out.println("inside the test method");
	}

}
