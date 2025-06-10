import java.util.Scanner;

public class Switchex1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter a number between 1 to 6 to get the corresponding month");
		int monthnum = scanner.nextInt();
		
		switch(monthnum) {
		case 1 :
			System.out.println("January");
			break;
			
		case 2 :
			System.out.println("Febuary");
			break;
			
		case 3:
			System.out.println("March");
			break;
			
		case 4:
			System.out.println("April");
			
		case 5 :
			System.out.println("May");
			
		case 6 :
			System.out.println("June");
		
			default:
				System.out.println("Invalid input! please enter a number between 1 to 6");

		}
		//close the scanner
		scanner.close();

		
	}

}
