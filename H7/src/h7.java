import java.util.Scanner;
/* Author - Christian Ramsey Professor Tong 10/15/2022
 * In this assignment, we were instructed to create a cylinder using a separate class.
 * The main part of this assignment was creating the class 'Cylinder' and making sure it
 * included all the right constructors and methods to find the correct answers for each 
 * cylinder.
 * 
 */
public class h7 {
	
	public static void main(String[] args) {
		//creates first cylinder object
		Cylinder cylinder1 = new Cylinder();
		System.out.println("The radius of the first cylinder is " + Cylinder.radius + " and the height is " +Cylinder.length);
		
		//takes user input
		System.out.print("Enter radius of cylinder 2: ");
		Scanner input1 = new Scanner(System.in);
		double a = input1.nextDouble();
		System.out.print("Enter length of cylinder 2: ");
		Scanner input2 = new Scanner(System.in);
		double b = input1.nextDouble();
		Cylinder cylinder2 = new Cylinder(a,b);
		System.out.println("The area of the cylinder 2 is " + cylinder2.getArea());
		//creates third cylinder object
		Cylinder cylinder3 = new Cylinder();
		System.out.print("Enter radius of cylinder 3: ");
		Scanner input3 = new Scanner(System.in);
		double c = input1.nextDouble();
		System.out.print("Enter length of cylinder 3: ");
		Scanner input4 = new Scanner(System.in);
		double d = input1.nextDouble();
		cylinder3 = new Cylinder(c,d);
		//outputs cylinder volume
		System.out.println("The volume of cylinder 3 is: " + cylinder3.getVolume());
		//outputs number of objects
		System.out.print("The number of objects is " + Cylinder.numOfObjects);
		
			
		}
	}


