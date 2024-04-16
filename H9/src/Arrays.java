import java.util.Scanner;

public class Arrays {

	//inputs array
	public static int[] inputArray(int size) {
		
		//input array values
		Scanner input1 = new Scanner(System.in);
		int[] list = new int[size]; 

		//reads in array values
		for(int i=0; i<size; i++) {
			list[i] = input1.nextInt();
		}
		return list; //returns array
	}
		
		//average method
		public static double average(int[] list) {
			double sum = 0, avg=0;
			for(int i=0; i<list.length; i++) {
			sum = sum + list[i]; //adding to every element in array
		}
		avg = sum/list.length; //average of array
		return avg;
	}
		
		//add method
		public static int[] add(int[] list1, int[] list2) {
			int[] list = new int[list1.length];
			for(int i=0; i<list1.length; i++) 
		{
		list[i] = list1[i] + list2[i];
		}
		return list; //return array 
	}
		//print method
		public static void displayArray(int[] list) {
		
			System.out.print("Sum of two arrays: ");
			for(int i=0; i<list.length; i++) //prints elements
		{
		System.out.print(list[i] + " ");
		
		}
	}
}


