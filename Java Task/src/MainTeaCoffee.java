import java.util.Scanner;

public class MainTeaCoffee {

	private static int tea=1;
	private static int coffee=2;
	private static int TeaPrice=20;
	private static int CoffeePrice=15;

	public static void main(String[] args) {

		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("TeaPrice: " + TeaPrice);
			System.out.println("CoffeePrice: " + CoffeePrice);
			System.out.println("Enter 1 to get Tea and 2 to get coffee: ");
			tea = sc.nextInt();
			/*if(tea==1){	
			System.out.println("How many tea you want(quantity): ");
			tea = sc.nextInt();
			int tea1 = tea * TeaPrice;
			System.out.println("Total Price: " + tea1);
			System.out.println("Your tea is ready...");
		}
		else if(coffee==2) {
			System.out.println("How many coffee you want(quantity): ");
			coffee = sc.nextInt();
			int coffee1 = coffee * CoffeePrice;
			System.out.println("Total Price: " + coffee1);
			System.out.println("Your coffee is ready...");
		}
		else{
			System.out.println("Number doesn't exists.");
		}
			 */
			switch(tea) {
			case 1:System.out.println("How many tea you want(quantity): ");
			tea = sc.nextInt();
			int tea1 = tea * TeaPrice;
			System.out.println("Total Price: " + tea1);
			System.out.println("Your tea is ready...");
			break;
			case 2:	System.out.println("How many coffee you want(quantity): ");
			coffee = sc.nextInt();
			int coffee1 = coffee * CoffeePrice;
			System.out.println("Total Price: " + coffee1);
			System.out.println("Your coffee is ready...");
			break;
			default:System.out.println("Number does'nt exists.");
			break;
			}
		}
	}
}


