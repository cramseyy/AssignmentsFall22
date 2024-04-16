import java.util.Scanner;
/* Author - Christian Ramsey Professor Tong 10/21/2022
 * For this assignment, we were instructed to create an array of a input by the user, and the
 * double the capacity of that array. The most important part of this program is making sure 
 * both methods inlcude the correct loops to loop the users input the correct amount of times. 
 * 
 */
public class lab8 {
	public static void main(String[] args) {
		//takes input from user
		System.out.print("Please enter the array size: ");
		Scanner input1 = new Scanner(System.in);
		int size = input1.nextInt();
	
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Please enter your array size: ");
		//declares array
		int[] list = new int[size];
		for (int j = 0; j < list.length; j++ ) {
			list[j] = input1.nextInt();
		}
		int[] array = doubleCapacity(list);
		//displays array
		displayArray(list);
		displayArray(array);
		

	}
		//method to double capacity
		public static int[] doubleCapacity (int[] list) {
			int[] newList = new int[list.length * 2]; 
			for (int j = 0; j < list.length; j++ ){ 

			newList[j] = list[j];
			} 
			return newList;
			} 
		
		//method to display array
		public static void displayArray (int[] list) {
			for(int i = 0; i < list.length; i++){ 
				System.out.print(list[i]+ " ");

				}
				System.out.println();
				}
				
		}

 