import java.util.Scanner;
/* Author - Christian Ramsey Professor Tong 9/22/2022
 * The main objective of this assignment was to print out composite numbers in lines of 5.
 * The first step to do this was declaring all the variables that you will need. Next, the most important part 
 * was setting up the nested loop statements correctly. After creating the first do loop statements, I added a 
 * conditional 'if' statement that would exit the loop 'if' a condition was met. Then, the program would proceed to 
 * the next 'if' statement and see 'if' that condition is met. If it was true, the program printed out a number, and added 1 to i
 * and count variables. After this 'if' statement, it would add to the 'num' variable and set j = 1 so that the next number will
 * be checked. The last statement is the statement that makes sure only 5 numbers are in each line.
 * 
 */
public class h5 {

	public static void main(String[] args) {
		//intakes user input
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    //declares variables
	    int n = input.nextInt();
	    
	    int j = 1;
	    int num = 1;
	    int count = 0;
	    //nested loop statement
	for (int i = 1; i <= n;) {
	    for (j = 2; j <= num / 2; j++) {
	        if (num % j == 0) {
	           j = 0;
	            break;
	        }
	    }
	    if (j == 0) {
	        System.out.print(num + " ");
	        i++;
	        count++;
	    }
	    j = 1;
	    num++;

	    if (count == 5) {
	        System.out.println();
	        count = 0;
	    //series of if statements checking if number is composite and if a new line needs to be started.	
	    	}
		}
	}
}





