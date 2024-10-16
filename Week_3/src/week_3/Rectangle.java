package week_3;

public class Rectangle {
	
	int width;
	int length;
	
	
	public Rectangle(int len, int wid) {
		this.length = len;
		this.width = wid;
	}
	
	public double getArea() {
		return this.width * this.length;
	}
	
}
