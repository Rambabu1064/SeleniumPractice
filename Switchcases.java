import java.util.Scanner;

public class Switchcases {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//prompt the user to enter a number between 1 to 7
		System.out.println("Enter a number between 1 to 7 to get the corresponding day of the week");
		
		int daynumber= scanner.nextInt();
		switch(daynumber) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
			
			default:
				System.out.println("Invalid input! please enter a number between 1 to 7");
		
		}
		//close the scanner 
		scanner.close();
		

	}

}
