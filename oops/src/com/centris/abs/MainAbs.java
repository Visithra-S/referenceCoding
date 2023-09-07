package com.centris.abs;

public class MainAbs {
	
	public static void hai() {
		System.out.println("Hi");
	}
	
	static {
		System.err.println("This is a static block");
	}

	public static void main(String[] args) {
		ExampleAbsFirst ex = new ExampleAbsSecond();
		ExampleAbsSecond ea = new ExampleAbsThird();
		
		//final int age = 10;
		
		System.out.println("ExampleAbsSecond class value is : ");
		//hai();
		//ex.grandParent();
		ex.fatherName();
		ex.motherName();
		ex.house();
		System.out.println("");
		System.out.println("ExampleAbsThird class value is : ");	
		ea.fatherName();
		ea.motherName();
		ea.house();
		System.out.println("");
		System.out.println("So, it is called abstraction.");
		ExampleAbsFirst.grandParent();
		
	}

}
