/* Author - Christian Ramsey Professor Tong 10/24/2022
 * In this assignment, we were instructed to use a separate class to create an array. 
 * The first important part of this assignment was creating the MyPoint java class to declare 
 * variables and get all the correct constructors and methods needed to create the array. The next
 * important part was using a nested for loop to print out the contents of each iteration of the array.
 * Finally, I printed out the answer.
 * 
 */
public class lab9 {
	public static void main(String[] args) {
		//declares array in main method, establishes points
		MyPoint[][] points = {{new MyPoint(0.5,1.2),new MyPoint(0.0,3.14),new MyPoint(15.0,27.5),new MyPoint(6.6,7.7),new MyPoint(1.2,2.1),new MyPoint(12.0,127.0)}};
		//loop that finds points for each array specified
		for(int i = 0; i < points.length; i++) {
			for(int j = 0; j < points[i].length; j++) {
		//outprints answer
				System.out.println("Array["+i+"]["+j+"] = (" + points[i][j].getX() + " , " + points[i][j].getY()+")");
	
			}
		}
	}
}
