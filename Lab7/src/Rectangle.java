//rectangle class
public class Rectangle {
	
	private double width = 1.0;
	private double height = 1.0;
	
	//no arg/default constructor
	Rectangle(){
		
	}
	//specified constructor
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	//sequence of methods to get area/parameter and modify width/height inputs
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double newHeight) {
		height = newHeight;
	}
	
	public double getArea() {
		return height * width;
	}
	
	public double getPerimeter() {
		return 2 * (height + width);
	}

}
