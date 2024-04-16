import java.util.Scanner;
/* Author - Christian Ramsey Professor Tong 10/14/2022
 * In this assignment, we were instructed to create a class to make a rectangle for us.
 * The most important part of this assignment was making sure the class included all of the 
 * correct formulas and methods to print out the correct answer. I took a user input and then changed the
 * input using the Rectangle class to modify the parameters of the object.
 * 
 */
public class RectangleTest {
	public static void main(String[] args) {
		//user input
		System.out.print("Enter width: ");
		Scanner input1 = new Scanner(System.in);
		double width = input1.nextDouble();
		
		System.out.print("Enter hieght: ");
		Scanner input2 = new Scanner(System.in);
		double height = input1.nextDouble();
		
		//implementing rectangle class
		Rectangle Rectangle1 = new Rectangle();
		Rectangle1 = new Rectangle(width,height);
		
		Rectangle1.setWidth(5.0);
		Rectangle1.setHeight(50.0);
		
		//print out statements
		System.out.println("The width before is " + width);
		System.out.println("The height before is " + height);
		System.out.println("The width after is " + Rectangle1.getWidth());
		System.out.println("The height before is "+ Rectangle1.getHeight());
		System.out.println("The area is " + Rectangle1.getArea());
		System.out.println("The perimeter is " + Rectangle1.getPerimeter());
	
	
	
	}

}
