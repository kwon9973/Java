package scratch;


import java.util.Arrays;

public class Scratch {
	
	private int [][] arr = new int[10][1];
	
	public void setData (int index, int num) {
		arr[index][0] = num;
	}
	public int [][] getData(){
		return arr;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Scratch arr = new Scratch();
		
		for (int i = 0; i < 10; i++) {
			arr.setData(i, 3);
			
			if (arr.getData()[i][0] == 3) {
				System.out.print("meh");
				continue;
			}
			
		}
		
		
		System.out.print(Arrays.deepToString(arr.getData()));
		
		
		int i =40;
		int j = 45;
		
		System.out.print(i % j);
		
		
		
	}
	
	
	
	
}
