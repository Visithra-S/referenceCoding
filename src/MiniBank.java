import java.util.Scanner;

public class MiniBank {

	private final static double miniAmount = 2000;

	public static void main(String[] args) {

		while(true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Minimum required deposit is 2000");
			System.out.println("Enter your deposit amount");
			int amt = sc.nextInt();

			if(miniAmount <= amt) {
				System.out.println("if");
			}else {
				System.out.println("else");
			}
		}	
	}
}
