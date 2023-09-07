public class TestException {
		
	int age;
	int dob;
	String name;

	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("non-static block");
	}
	
	TestException(int a,String n) {
		
		age = a;
		name = n;
		System.out.println(age + " " + name);
	}
	
    TestException(int a,int b,String n) {
		
		age = a;
		name = n;
		dob=b;
		System.out.println(a + " " + n + " " + b);
	}
	
	public static void main(String[] args) {
		TestException te = new TestException(23,"Visithra S");
		TestException te1 = new TestException(23,28,"Visithra S");
	}
		
}
