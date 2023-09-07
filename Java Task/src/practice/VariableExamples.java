package practice;

public class VariableExamples {
	
	int b = 20;//instance variable and non static variable its only access through the object creation
	static int c = 25;//static variable can be access through the direct and class name
	
	public static void main(String[] args) {
		
		VariableExamples ve = new VariableExamples();
		int a=10;//local variable
		System.out.println("Local variable value is : " + a);
		System.out.println("instance variable value is : " + ve.b);
		System.out.println("direct object creation : " + new VariableExamples().b);
		System.out.println("static variable value is : " + c);
		System.out.println("static variable value is using class name : " + VariableExamples.c);
	}

}
