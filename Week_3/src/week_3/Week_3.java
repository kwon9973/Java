package week_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Week_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.print("Enter a sequence of numbers ending in 0: ");
		int num = input.nextInt();
		
		while(num != 0) {
			arrayList.add(num);
			num = input.nextInt();
		}
		System.out.print(arrayList.toString());
		
	}

}
