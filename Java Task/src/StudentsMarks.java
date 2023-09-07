import java.util.Scanner;

public class StudentsMarks {

	private static double Percentage;
	private static int stuTotalMark;
	private static int subtotalmark=100;
	private final static int examTotalMark=1200;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("You want to know your percentage");
		
		System.out.println("Enter your tamil Mark: ");
		int tamil = sc.nextInt();
		
		System.out.println("Enter your english Mark: ");
		int english = sc.nextInt();
		
		System.out.println("Enter your physics Mark: ");
		int physics = sc.nextInt();
		
		System.out.println("Enter your chemistry Mark: ");
		int chemistry = sc.nextInt();
		
		System.out.println("Enter your biology Mark: ");
		int biology = sc.nextInt();
		
		System.out.println("Enter your maths Mark: ");
		int maths = sc.nextInt();
		
		
		stuTotalMark = tamil + english +  physics + chemistry + biology + maths ;
		Percentage = ( (double) (stuTotalMark * subtotalmark) / (examTotalMark)) ;
		
		System.out.println("stuTotalMark: " + stuTotalMark);
		
		if(stuTotalMark <= examTotalMark) {
			
			System.out.println("Percentage: " + Percentage);
			
		}else {
			System.out.println(" Invaild total mark...");
		}
		
	}

}
