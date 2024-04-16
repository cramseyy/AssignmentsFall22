
/*Author - Christian Ramsey Professor Tong 10/2/2022
 * In this assignment, we were instructed to utilize overloading methods to find the max of a set 
 * group of numbers. Honestly, I struggled with this one and was not completely sure how to get each method 
 * to send the result I wanted without explicitly inputting the number. I understand that you must use
 * 3 methods with the same name, and change the parameters so that the program knows which one to call,
 * but I couldn't really figure out how to do that exactly. I believe I got the correct output but I am not
 * sure if the setup is the correct way.
 * 
 */
public class lab6 {
	public static void main(String[] args) {
			//declares variables
			int a = 4; 
			int b = -9; 
			int c = 7; 
			int d = 10;
						
			int larger = max(a,b);
			//calls the method
			System.out.println("The larger of a and b is " + larger);

			int largestOfThree = max(a,b,c);

			System.out.println("The largest of a, b, and c is " + largestOfThree);

			int largestOfFour = max(a,b,c,d);

			System.out.println("The largest of a, b, c and d is " + largestOfFour);
			//print statements
		}
					
			//main part of the assignment. Sequence of 3 methods used to find the max of 4 numbers.		
			public static int max(int a, int b) { 
				if(a > b);
				return a;
								
			}
						
				public static int max(int a, int b, int c) {
					if(c > b && c > a);
					return c;
				}
						
					public static int max(int a, int b, int c, int d) {
						if(d > a && d > b && d > c);
						return d;
					}
		}			
		 
	 



	

	


