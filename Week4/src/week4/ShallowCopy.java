package week4;

public class ShallowCopy extends House implements java.lang.Cloneable {
	
	public Object clone() {
		return (House)super.clone();
	}
}
