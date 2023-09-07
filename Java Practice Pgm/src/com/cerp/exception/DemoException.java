package com.cerp.exception;

public class DemoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4711539570502431592L;

	public void createException() {

		//try {

			System.out.println(10/0);
		    
			//String visi = new String("dfsdf");
			//endCard(visi);
			
			//System.out.println("vc is a best friend of kavi : "+visi);

		/*}catch (Exception e) {
			System.out.println("Something went wrong" + e.getMessage());
			//e.printStackTrace();
			//System.err.println("Something went wrong" + e.getMessage());
		}*/

	}

	public void greatings() {
		System.out.println("Welcome Keran...");
	}

	public static void main(String[] args) {

		/**
		 * 
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		 * 
		 * 
		 * 
		 * 
		 * */

		try {

			DemoException instance = new DemoException();

			instance.greatings();
			System.out.println("I am intermediate");
			instance.createException();
			System.out.println("I am intermediate II");
			
		}catch (Exception e) {
			
			//System.out.println("Something went wrong" + e.getMessage());
			//e.printStackTrace();
			//System.err.println("Something went wrong" + e.getMessage());
		}
	}
}
