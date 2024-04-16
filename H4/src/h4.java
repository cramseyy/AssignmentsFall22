import java.util.Scanner;
/* Author - Christian Ramsey Professor Tong 9/16/2022
 * Honestly, not completely sure how to get this one to work. I tried messing around with it for a while
 * but I just couldn't figure this one out. I know how to take the input from the user and set the 1 - 15 
 * number range, but I am not sure how to get it to print the '*' correctly and mirror the result at the 
 * end.
 * 
 */
public class h4 {
	public static void main(String[] args) {
	//takes user input
		//Step 1: Declare inputs and prompt user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer here: ");
		int userValue = input.nextInt();
		//Step 2: Create Upper Triangle
		int i = 1;
		while(i <= userValue) {
			int a = i;
			int b = 0;
			//Number of spaces for the number given by user minus 1 for appropriate spacing
			while(b < userValue - i) {
				System.out.print(" ");
				b++;
			}
			//Decreases number by 1
			while(a > 0) {
				System.out.print("*");
				a--;
			}
			//Increases number from 1 to number
			a = 2;
			while(a <= i) {
				System.out.print("*");
				a++;
			}
			//Make a new line
			System.out.println();
			i++;
			}
		//Step 3: Create Lower Triangle
		int j = userValue - 1;
		while(j > 0) {
			int a = j;
			int b = 0;
			//Number of spaces for the number given by user minus 1 for appropriate spacing
			while(b < userValue - j) {
				System.out.print(" ");
				b++;
			}
			//Decreases number by 1
			while(a > 0) {
				System.out.print("*");
				a--;
			}
			//Increases number from 1 to number
			a = 2;
			while(a <= j) {
				System.out.print("*");
				a++;
			}
			//Make a new line
			System.out.println();
			j--;
			}
		input.close();
	}
}
		   
		 

