//creates class
public class Cylinder {
	static double radius = 1;
	static double length = 1;
	static int numOfObjects = 3;
	//public variables

		
	//default constructor/no-arg constructor
	Cylinder(){
		
	}
	
	//specified radius and length constructor
	Cylinder(double a, double b){
		radius = a;
		length = b;
	}

	Cylinder(double newRadius, double newLength, double c, double d){
		newRadius = c;
		newLength = d;
	}



	//area method
	public double getArea() {
		return (2 * (Math.PI) * radius * length + 2 * (Math.PI) * Math.pow(radius,2));
	}
	
	//volume method
	public double getVolume() {
		return (Math.PI * Math.pow(radius, 2) * length);
	}

	//numOfObjects method
	public int getNumOfObjects(int a) {
		a = 2;
		return a;
	}
	
}
	
		
	
