package week4;


import java.util.Date;


public class House implements java.lang.Cloneable , java.lang.Comparable<House>{
	private int id;
	private double area;
	private Date whenBuilt;
	
	public House() {
		this.id = 0;
		this.area = 10;
		whenBuilt = new Date();
	}
	public House(int id, double area) {
		this.id = id;
		this.area = area;
		whenBuilt = new Date();
	}
	public int getId() {
		return id;
	}
	public double getArea() {
		return area;
	}
	public Date getWhenBuilt() {
		return whenBuilt;
	}
	public void setWhenBuilt(Date whatever) {
		this.whenBuilt = whatever;
	}
	public Object clone() {
		try {
			House houseClone = (House)super.clone();
			//houseClone.whenBuilt = new Date();
			//houseClone.getWhenBuilt().setTime(whenBuilt.getTime());
			return houseClone;
			
		}catch(CloneNotSupportedException e) {
			return null;
		}
	}
	public int comparaeTo(House h) {
		if(area > h.getArea()) {
			return 1;
		}else if(area == h.getArea()) {
			return 0;
		}else {
			return -1;
		}
	}
	public String toString() {
		return "" + this.id + " " +  this.area;
	}
}
