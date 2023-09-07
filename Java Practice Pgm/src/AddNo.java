
public class AddNo {

	public static void main(String[] args) {
		int n=3;
		
		String ouput = findOddMNumber(n); // This is Odd no (or) This is Even no 
		
		System.out.println(ouput);
	}

	private static String findOddMNumber(int n) {
		return n % 2 != 0 ? "This is Odd no " : "This is Even no ";
	}


}
