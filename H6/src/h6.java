import java.util.Scanner;
/* Author - Christian Ramsey Professor Tong 10/2/2022
 * In this assignment, we were instructed to find the summation of 2 numbers. For example, entering -3 and 5 
 * returned the answer 9, by adding each number -3, -2, -1, and so on. The main parts of this assignment were first,
 * to obtain user input for 2 integers. After this, creating a method to do the actual calculation was the most important,
 * and most difficult part. You had to use a loop in the method to add each individual number together to do proper summation.
 * After the calculation was complete, the answer was returned and displayed using a method.
 */
public class h6 {

	public static void main(String[] args) {
		//obtaining user input
		System.out.print("Enter num1: ");
		Scanner input1 = new Scanner(System.in);
		int num1 = input1.nextInt();
		
		System.out.print("Enter num2: ");
		Scanner input2 = new Scanner(System.in);
		int num2 = input2.nextInt();
		//displays the result
		int num3 = sum(num1, num2);
		System.out.println(num3);
		
		}
	//the method that does the calculation. Utilizes a for loop to add each number together.
	public static int sum(int num1, int num2) {
	int num3 = 0;
		for(int i = num1; i <= num2; i++) {
			
			num3 += 1;
			
		}
		return num3;
		//returns the number to be used as the result
	}
}

			
	
	