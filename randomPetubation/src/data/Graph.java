package data;

public class Graph {

	String [][] graph;
	private int row = 100;
	private int col = 100; 
	
	
	public Graph() {
		this.graph = new String[row][col];
	}
	public Graph(int row, int col) {
		this.graph = new String[row][col];
	}
	public void setSize (int row, int col) {
		this.row = row;
		this.col = col;
	}
	public void displayGraph(double [][] num) {
		
		String empty = " ";
		int colCount = 100;
		
		for (int i = row; i > 0; i--) { 
			for(int j = col; 0 < j; j--) {
				System.out.print(j);
				System.out.print(".");
				
				for (int k = 0; k < num.length;k++) {
					if(colCount == num[i][k]) {
						System.out.print(k);
						System.out.print("G");
					}
				}
				
				 colCount--;
			}
			System.out.print(colCount);
			System.out.println();
		}
		
	}
}

