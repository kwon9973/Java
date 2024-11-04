package week4;

public class Rectangle extends GeometricObject{
	int width;
	int length;
	double area;
	
	public Rectangle(int len, int wid) {
		this.length = len;
		this.width = wid;
	}
	
	public double getArea() {
		this.area = this.width * this.length;
		return this.area;
	}
	public String toString() {
		return "Rec: " + width + " " + length;
	}
}
