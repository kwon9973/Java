package week4;

import java.util.Date;

public class Circle extends GeometricObject implements java.lang.Cloneable , java.lang.Comparable<Circle>{
	
	private double radius;
	private double area;
	private Date date;
	
	
	public Circle() {
		this.radius = 5;
		this.area = Math.pow(radius, 2) * 3.14;
		this.date = new Date();
	}
	public Circle(double radius) {
		this.radius = radius;
		this.area = Math.pow(this.radius, 2) * 3.14;
		this.date = new Date();
	}
	public Date getDate() {
		return this.date;
	}
	
	public Object clone() {
			//Circle clone = (Circle)super.clone();
		Circle clone = new Circle();
		clone.getDate().setTime(this.getDate().getTime());
					
		return clone;
	}
	
	public String toString() {
		return "Cir: " + this.radius + " " + this.area;
	}
	
	public double getArea() {
		this.area = Math.pow(this.radius,2) * 3.14; 
		return area;
	}
}
