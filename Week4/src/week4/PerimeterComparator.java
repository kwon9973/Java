package week4;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<GeometricObject>{
	public int compare(GeometricObject o, GeometricObject o2) {
		if(o.getArea() > o2.getArea()) {
			return 1;
		}else if(o.getArea() == o2.getArea()) {
			return 0;
		}else {
			return -1;
		}
	}
}
