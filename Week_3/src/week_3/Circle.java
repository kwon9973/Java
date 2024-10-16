package week_3;

public class Circle extends GeometricObject implements Comparable<Circle>{

	double radius;
	
	Circle(){
		radius = 5;
	}
	Circle(double rad){
		radius = rad;
	}
	
	public double getArea() {
		return Math.pow(radius, 2) * 3.14;
	}
}
