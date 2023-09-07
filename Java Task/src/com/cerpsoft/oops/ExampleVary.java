package com.cerpsoft.oops;

public class ExampleVary {

	static String fatherName = "Subramanian"; //static variable
	static String motherName = "Veerammal";
	int age = 23;//instance variable


	public static void main(String[] args) {

		ExampleVary ev = new ExampleVary();

		String name="Visithra S";//local variable

		System.out.println("My FatherName is : " + fatherName);
		System.out.println("My MotherName is : " + ExampleVary.motherName);
		System.out.println("My Name is : " + name);
		System.out.println("My Age is : " + ev.age);
		
		/*int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a+b);*/
	}

}
