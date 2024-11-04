package week4;

import java.util.Comparator;

public class GeometricComparator implements Comparator<GeometricObject> , java.io.Serializable {
	public int compare(GeometricObject o, GeometricObject o2) {
		double area = o.getArea();
		double area2 = o2.getArea();
		
		if (area > area2) {
			return 1;
		}else if(area == area2) {
			return 0;
		}else {
			return -1;
		}
	}
}
