
public class ExampleMethodOverload {
	
	static int add(int a,int b) {
		return a+b;	
	}

	static double add(double c,int d) {
		return c+d;	
	}
	
	public static void main(String[] args) {
		System.out.println(ExampleMethodOverload.add(11,22));
		System.out.println(ExampleMethodOverload.add(11,44));
	}

}
