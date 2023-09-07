package com.centris.enc;

public class MainEnc {

	public static void main(String[] args) {
		
		ExampleEnc ee = new ExampleEnc();
		ee.setFathername("Subramanian C");
		ee.setMothername("Veerammal S");
		ee.setMyname("Visithra S");
		
		System.out.println(ee);
		
		ExampleEnc vs = new ExampleEnc();
		vs.setFathername("Thangavel");
		vs.setMothername("chinnapillai");
		vs.setMyname("Veerammal S");
		
		System.out.println(vs);
		
		/*System.out.println("Father Name : " + ee.getFathername());
		System.out.println("Mother Name : " + ee.getMothername());
		System.out.println("My Name : " + ee.getMyname());
		
		ee.setFathername("Thangavel");
		ee.setMothername("chinnapillai");
		ee.setMyname("Veerammal S");
		
		System.out.println("Father Name : " + ee.getFathername());
		System.out.println("Mother Name : " + ee.getMothername());
		System.out.println("My Name : " + ee.getMyname());
		
		ee.setFathername("Chinnasami");
		ee.setMothername("pachaiyammal");
		ee.setMyname("Subramanian C");
		
		System.out.println("Father Name : " + ee.getFathername());
		System.out.println("Mother Name : " + ee.getMothername());
		System.out.println("My Name : " + ee.getMyname());*/
	}

}
