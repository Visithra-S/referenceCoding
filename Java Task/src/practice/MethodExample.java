package practice;

public class MethodExample {

	void show() {
		int i = 10;
		System.out.println(i);
	}
	
	static int show1() {
		int a= 20;
		return a;
		
	}
	public static void main(String[] args) {
		MethodExample me = new MethodExample();
		me.show();
		System.out.println(show1());
	}

}
