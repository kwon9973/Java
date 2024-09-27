package data;


public class Data {
	
	private double [][] var;
	private int label = 100;
	private int size = 1;
	
	
	public Data() {
		var = new double [label][size];
	}
	public Data(int label) {
		var = new double [label][size]; 
	}
	public void setSize(int label) {
		var = new double[label][this.size];
	}
	public double [][] getData() {
		 return var;
	}
	public void setData(int label, double value) {
		var[label][0] = value;
	}
}
	


