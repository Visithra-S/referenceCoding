package com.cerp.garbagecollector;

public class GcDemo {
	
	public static void main(String[] args) {
		GcDemo instance = new GcDemo();
		instance.sayHi();
		
		// System.gc();
		Runtime.getRuntime().gc();
		System.out.println("Total Memory : "+Runtime.getRuntime().totalMemory());
		System.out.println("Max Memory : "+Runtime.getRuntime().maxMemory());
		System.out.println("Free Memory : "+Runtime.getRuntime().freeMemory());
		System.out.println("Main method I.");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Inside the finalize method.");
	}
	
	public void sayHi(){
		System.out.println("I Can't.");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
