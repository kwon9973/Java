package week_3;

import java.util.Date;

public class GeometricObject {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	
	public GeometricObject() {
		dateCreated = new Date();
	}
	public GeometricObject(String newColor, boolean newFilled) {
		dateCreated = new Date();
		this.color = newColor;
		this.filled = newFilled;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String col) {
		this.color = col;
	}
	public boolean isFilled() {
		if(this.filled == true) {
			return true;
		}else {
			return false;
		}
	}
	public void setFilled(boolean newFilled) {
		this.filled = newFilled;
	}
	public java.util.Date getDateCreated(){
		return this.dateCreated;
	}
	
	public String toString() {
		return "color: " + this.color + " \nfilled: " + this.filled + "\nDate: " + this.dateCreated;
	}
	
	
}
