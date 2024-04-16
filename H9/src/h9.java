import java.util.Scanner;
/* Author - Christian Ramsey Professor Tong 10/26/2022
 * In this assignment, we were instructed to create an array using a users input to specify the size
 * of the array, and then use a sequence of methods to compute calculations to get the correct answer 
 * for each element of the array. The first important part of this assignment was creating a separate
 * class that included all of the methods to make the computations to get the correct answers for the 
 * array elements. Next, implementing the arrays class to the main method to display the arrays values 
 * was the next most important part.
 * 
 */
public class h9 {
	public static void main(String args[]) {
		
		//takes user input for size of array
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter size of array: ");  
		int size = input1.nextInt(); 
		//takes input for values of first array
		System.out.print("Enter first array values: "); 
		int list1[] = Arrays.inputArray(size); //calling the method to input the array.
		//takes values of second array
		System.out.print("Enter second array values: "); 
		int list2[] = Arrays.inputArray(size); //calling the method to input the array.
		//gets average of first array
		double avg = Arrays.average(list1); 
		System.out.println("Average of first array: " + avg); 
		//gets sum of 2 arrays
		int list[] = Arrays.add(list1, list2); 
		//prints array
		Arrays.displayArray(list); 	
	
	}
}
	

