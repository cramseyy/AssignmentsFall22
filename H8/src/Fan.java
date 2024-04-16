//variable declarations in the data field
public class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	int speed;
	boolean on;
	
	double radius;
	String color;
	//no arg constructor
	Fan(){
		speed = SLOW;
		on = false;
		radius = 5.0;
		color = "blue";
		
	}
	//series of methods/constructors to get the right answer for each fan
	public int getSpeed() {
		return speed;
	}
	
	public boolean on() {
		return on;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	public void setOn(boolean newOn) {
		on = newOn;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	//conditional print method that prints out the information based on what each object has in its data field
	public String printString() {
	      
       
        if(on){
            return "Fan is on with speed = "+speed+", color = "+color+", radius = "+radius;
        }
        
        else{
            
            return "Fan is off with color = "+color+", radius = "+radius+"";
        }
    }
    


	}
