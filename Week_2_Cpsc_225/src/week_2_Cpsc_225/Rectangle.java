package week_2_Cpsc_225;

public class Rectangle {
	
	
	//private access in the is class
	private double length = 1;
	private  double width = 1;
	
	private static int numberOfObject = 0;
	
	//using public make it more accessible.
	public static int getNumberOfObject() {
		
		return numberOfObject;
	}
	
	public Rectangle(){numberOfObject++;}
	
	public Rectangle(double len, double wid){
		numberOfObject++;
		this.length = len;
		this.width = wid;
	}
	
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getPerimeter() {
		return 2*width + 2*length;
	}
	public double getArea() {
		return width*length;
	}
}
