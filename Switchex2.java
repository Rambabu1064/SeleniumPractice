import java.util.Scanner;

public class Switchex2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number between 7 to 12");
		
		int monthnum= scanner.nextInt();
		
		switch(monthnum) {
		
		case 7 :
			System.out.println("July");
			break;
			
		case 8 :
			System.out.println("August");
			break;
			
		case 9 :
			System.out.println("September");
			break;
			
		case 10: 
			System.out.println("October");
			break;
			
		case 11 :
			System.out.println("November");
			break;
			
		case 12 :
			System.out.println("December");
			break;
			
		}
		//Close the scanner
		scanner.close();

	}

}
