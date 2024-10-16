package week_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Week_3 {

	/*
	public static <E extends Comparable<E>> E max(E[] list){
		E largest = list[0];
		
		for(int i = 1; i < list.length; i++) {
			if(list[i].compareTo(largest) > 0) {
				largest = list[i];
			}
		}
		
		
		
		return largest;
	}
	/
	*/
	
	
	
	/*
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E largest = list.get(0);
		
		for(int i = 0; i < list.size(); i++) {
			
			if (list.get(i).compareTo(largest) > 0) {
				largest = list.get(i);
			}
		}
		
		return largest;
	}
	*/
	
	/*
	public static <E> void shuffle (ArrayList<E> list) {
		for(int i = 0; i < list.size(); i++) {
			int randNum = (int)Math.random()*list.size();
			
			E temp = list.get(randNum);
			
			list.set(randNum, list.get(i));
			list.set(i, temp);
			
			
			
		}
	}
	*/
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.print("Enter a sequence of numbers ending in 0: ");
		int num = input.nextInt();
		
		while(num != 0) {
			arrayList.add(num);
			num = input.nextInt();
		}
		System.out.print(arrayList.toString());
		*/
		
		
		/*
		ComparableRectangle r1 = new ComparableRectangle(2,3);
		ComparableRectangle r2 = new ComparableRectangle(4,5);
		ComparableRectangle r3 = new ComparableRectangle(5,6);
		
		
		
		System.out.println(r1.compareTo(r2));
		
		ComparableRectangle[] rr = {r2,r1,r3};
		
		Arrays.sort(rr);
		System.out.print(Arrays.toString(rr));
		*/
		
		
		/*
		Integer[] arr1 = {5,2,6,3};
		System.out.println(arr1);
		*/
		

		/*
		ArrayList<Integer> arrLst = new ArrayList <>();
		arrLst.add(1);
		arrLst.add(2);
		arrLst.add(3);
		System.out.println(arrLst);// displaying 3
		
		
		
		ArrayList<Circle> arrLst2 = new ArrayList <>();
		arrLst2.add(new Circle(4));
		arrLst2.add(new Circle(5));
		arrLst2.add(new Circle(6));
		System.out.println(max(arrLst2));
		*/
		
		/*
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println(list1);
		shuffle(list1);
		System.out.println(list1);
		*/
		
		
		
		
		
		
	}
	
	
}
