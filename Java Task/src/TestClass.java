
public class TestClass {
	
	public static synchronized void say(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		Thread letters = new Thread() {
		 public void run() {
				say("a");
				say("b");
				say("c");
			}
		};
		Thread numbers = new Thread() {
			public void run() {
				say("1");
				say("2");
				say("3");
			}
		};
	}

}
