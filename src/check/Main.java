package check;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to my even number checker app");
		String choice;
		
		do 
		{
		System.out.print("\n\nPlease enter an integer: ");
		int entry = scanner.nextInt();
		
		if(entry % 2 == 0) 
		{
			System.out.println("\n\nThis is even.");
		}
		else 
		{
			System.out.println("\n\nThis is odd.");
		}
			
		System.out.print("\nWould you like to go again? (y/n): ");
		choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
	}

}
