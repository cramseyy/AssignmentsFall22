import java.util.Scanner;
import java.util.InputMismatchException;
/* Author - Christian Ramsey Professor Tong 11/15/2022
 * In this assignment, we were instructed to utilize try/catch blocks to catch an exception that was
 * thrown when a float value was entered. The first step to doing this was creating the try/catch block
 * around the lines of code that were causing this exception. Now, in this code, the program will try to run the
 * second 'do' loop, and if a float value is entered, it will be caught in the catch block. The try/catch blocks
 * are surrounded by a loop statement as well, so the program will not terminate until an acceptable value is
 * entered.
 * 
 */
public class lab12 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		//loop around the try/catch blocks that continues program
		do {
			try {
			//loop that checks numbers
			do {
		       System.out.println("Enter a number between 1 and 10");    
		       num = scan.nextInt();
		  
		       if (num < 1 || num > 10) 
		         System.out.println("\nIllegal value, " + num + " entered.  Please try again.");
		  
			} while (num < 1 || num > 10);    
			
		}
		//catches exception	
		catch (InputMismatchException ime) {
				System.out.println("\nEnter whole numbers only, with no spaces or other characters");
				    scan.next();
				}
		} while (num < 1 || num > 10);
		
		System.out.println("\nValue correctly entered! Thank you.");
		  
	}
}





