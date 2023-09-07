
public class StaticBlock {
	
	static String name = "visithra";
	
	public StaticBlock() {
		System.out.println("I am constructor");
	}
	
	{
		System.out.println(name);
		System.out.println("I am non-static block");
		samplemethod();
	}
	
	static 
	{
		//System.out.println(name);
		System.out.println("I am static block");
		//samplemethod();
	}
	
	public static void samplemethod() {
		System.out.println("I am method");
	}
	
	public static void main(String[] args) {
		StaticBlock sb = new StaticBlock();
		System.out.println("I am main method");
	}

}
