
public class MyPoint {
	//private variables
	private double x;
	private double y;
	//no arg constructor
	MyPoint(){
		x = 0;
		y = 0;
	}
	
	
	//sequence of get and set methods
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double newX) {
		x = newX;
	}
	
	public void setY(double newY) {
		y = newY;
	}
	//method to get a specific point
	public MyPoint(double newX, double newY) {
		x = newX;
		y = newY;
	}
}
