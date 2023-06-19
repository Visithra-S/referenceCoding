import java.util.Scanner;

public class Register {

	public static void main(String[] args) {

		/*
		 * for(int i=0;i<5;i++) {
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter your name: "); String userName = sc.nextLine();
		 * 
		 * System.out.println("Enter your password: "); String password =sc.nextLine();
		 * 
		 * System.out.println("Enter your EmailId: "); String email = sc.nextLine();
		 * 
		 * System.out.println("UserNmae: " + userName); System.out.println("Password: "
		 * + password); System.out.println("Email: " + email); System.out.println(); }
		 */

		User user1 = new User("xyz", "xyz", "xyz");
		User user2 = new User("xyz1", "xyz1", "xyz1");
		User user3 = new User("xyz2", "xyz2", "xyz2");
		User user4 = new User("xyz3", "xyz3", "xyz3");
		User user5 = new User("xyz4", "xyz4");

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(user4);
		System.out.println(user5);

		/*
		 * String UserName = "Visithra"; UserName = UserName + "Kavi";
		 * System.out.println(UserName);
		 * 
		 * System.out.println("----------------------------------------");
		 * 
		 * int UserName1 = 1; UserName1 = UserName1 + 2; System.out.println(UserName1);
		 */

	}

}
