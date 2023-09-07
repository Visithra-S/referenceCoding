
public class X implements Runnable{
	
	public static void main(String[] args) {
		X run = new X();
		Thread t = new Thread(run);
		t.run();
	}

	@Override
	public void run() {
		System.out.println("Fun Time!");
	}

}
