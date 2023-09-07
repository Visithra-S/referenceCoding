import java.util.Scanner;

public class MainMethod {
	
	public static void main(String[] args) {
		char operator;
		double number1 ,number2,number3,number4,number5,result;
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Choose an operator: +, -, *, or /");
			operator = sc.next().charAt(0);
			
			System.out.println("Enter the first numbers: ");
			number1 = sc.nextDouble();
			
			System.out.println("Enter the second numbers: ");
			number2 = sc.nextDouble();
			
			System.out.println("Enter the third numbers: ");
			number3 = sc.nextDouble();
			
			System.out.println("Enter the fourth numbers: ");
			number4 = sc.nextDouble();
			
			System.out.println("Enter the fifth numbers: ");
			number5 = sc.nextDouble();
			
			double TotalMark;
			double percentage;
			switch(operator) {
			case '+':
				result = number1 + number2 + number3 + number4 + number5;
				System.out.println(result);
				break;
			case '-':
				result = number1 + number2 + number3 + number4 + number5;
				System.out.println(result);
				break;
			case '*':
				result = number1 + number2 + number3 + number4 + number5;
				System.out.println(result);
				break;
			case '/':
				result = number1 + number2 + number3 + number4 + number5;
				System.out.println(result);
				break;
				default:
					System.out.println("Invalid operator");
					break;
			}
			sc.close();
		}
		}
		

