import java.util.HashSet;
import java.util.Scanner;

public class BusTicketConfirmation{

	private static TownsListPojo instance;
	private static HashSet<String> townNames;

	static {

		townNames = new HashSet<String>();
		townNames.add("salem");
		townNames.add("bangalore");
		townNames.add("attur");
		townNames.add("chennai");
		townNames.add("perambalur");
		townNames.add("ariyalur");
		townNames.add("trichy");

		instance = new TownsListPojo();
		instance.setName(townNames);
	}


	public static void main(String[] args) {

		System.out.println("Welcome to visithra Travels : ");

		while(true) {

			Scanner sc = new Scanner(System.in);

			System.out.println("From: ");
			String from = sc.nextLine();
			System.out.println("To:");
			String to = sc.nextLine();

			if(townNames.contains(from.toLowerCase()) && townNames.contains(to.toLowerCase())) {

				System.out.println("Your BusNo 4457(Available seats 5).");
				System.out.println("How many ticket you want");
				final int ticket =sc.nextInt();
				System.out.println("Your booking is confirmed...");
/*				switch(seats) {
				case 1 : 
					System.out.println(from + " to " + to + " Your amount is 250");
					System.out.println("Your seat is booked");
					break;
				case 2 : 
					System.out.println(from + " to " + to + " Your amount is 260");
					System.out.println("Your seat is booked");
					break;
				case 3 : 
					System.out.println(from + " to " + to + " Your amount is 270");
					System.out.println("Your seat is booked");
					break;
				case 4 : 
					System.out.println(from + " to " + to + " Your amount is 280");
					System.out.println("Your seat is booked");
					break;
				case 5 : 
					System.out.println(from + " to " + to + " Your amount is 290");
					System.out.println("Your seat is booked");
					break;
				default:
					System.out.println("Number doesn't exists.Please,Enter correst seatNo........");
					System.out.println("Available seats are 1 to 5.");
					break;
				}*/
			}else {
				System.out.println("Town does not exits...");
			}
		}

	}
}