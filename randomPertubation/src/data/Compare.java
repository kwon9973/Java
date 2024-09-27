package data;

public class Compare {

	double num;
	
	public Compare() {
		this.num = 0;
	}
	public Compare(double num) {
		this.num = num;
	}
	public void setData(double num) {
		this.num = num;
	}
	public double getData() {
		return num;
	}
	public boolean isBigger(double num) {
		return this.num < num;
	}
	
	

}
