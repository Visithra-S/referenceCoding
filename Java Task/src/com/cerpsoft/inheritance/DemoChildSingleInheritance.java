package com.cerpsoft.inheritance;

public class DemoChildSingleInheritance extends DemoParentSingleInheritance{

	@Override
	public void getToatlChildName() {
		System.out.println("Visithra.S");
	}

	public static void main(String[] args) {
		DemoChildSingleInheritance si = new DemoChildSingleInheritance();
		si.fatherName();
		si.motherName();
		System.out.println("My Name is: " + si.myName);
	}

}
