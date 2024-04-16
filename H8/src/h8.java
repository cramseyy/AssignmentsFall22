/* Author - Christian Ramsey Professor Tong 10/18/2022
 * In this assignment, we were instructed to create a separate class to print out the status of two fan
 * objects. This assignment is similar to the previous one that we had the week before. The main part of this
 * assignment is creating the class Fan and implementing it correctly into the homework file. This includes
 * making sure all methods and constructors are included in the class, and that the printString method correctly
 * outputs the information for each fan.
 * 
 */
public class h8 {
	public static void main(String[] args) {
		//fan object 1
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        //fan object 2
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setColor("Blue");
        fan2.setOn(false);
        fan2.setRadius(5);
        //outprint lines
        System.out.println(fan1.printString());
        System.out.println(fan2.printString());

        
        
       
        
    }
    
}
	
