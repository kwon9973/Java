package week_3;

public class ComparableRectangle extends Rectangle implements java.lang.Comparable<ComparableRectangle >{

	public ComparableRectangle(int length, int width) {
		super(length, width);
	}
	
	public String toString() {
		
		double area = (this.length * this.width);
		String str;
		
		str = "" + area;
		
		return str;
	}
	
	
	public int compareTo(ComparableRectangle e) {
		if (getArea() > e.getArea()) {
			return 1;
		}else if(getArea() == e.getArea()) {
			return 0;
		}else {
			return -1;
		}
	}
}
