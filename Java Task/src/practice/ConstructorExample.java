package practice;

public class ConstructorExample {
	int x;
	
	public  ConstructorExample(int x) {  // args primitive type iruntha athu argumeent // oru object ahh pass ahh ath parameter
		this.x=x;
	}
	
	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample(10);
		System.out.println(ce.x);
	}
}
