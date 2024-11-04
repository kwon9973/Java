package week_3;


public class Circle extends GeometricObject{ //extends GeometricObject implements java.lang.Comparable<Circle>{
	
	private double radius;
	private static int numberOfObjects = 0;
	
	Circle(){
		numberOfObjects++;
		radius = 5;
	}
	Circle(double rad){
		numberOfObjects++;

		if(rad < 0) {
			throw new IllegalArgumentException();
		}
		this.radius = rad;
		
	}
	
	public static int getNumbverOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return Math.pow(radius, 2) * 3.14;
	}
	
	public void setRadius(double rad) {
		
		if(rad < 0) {
			throw new IllegalArgumentException();
		}
		this.radius = rad;
	}
	public String toString() {
		return "radius: " + radius;
	}
	
}
