package week_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.EmptyStackException;


public class Week_3 {

	/*
	public static <E extends java.lang.Comparable<E>> E max(E[] list){
		E largest = list[0];
		
		for(int i = 1; i < list.length; i++) {
			if(list[i].compareTo(largest) > 0) {
				largest = list[i];
			}
		}
		return largest;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/*
		MyStack stack = new MyStack();
		stack.getList().add(0);
		System.out.print(stack.toString());
		*/
		
		/*
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		try {
			System.out.println(array[12]);
		}catch(Exception e) {
			System.out.print("index out of bounds");
		}
		
		System.out.println(array[0]);
		*/
	
		
		
		/*
		StackOfIntegers s = new StackOfIntegers();
		try {
			s.pop();
		}catch(EmptyStackException e) {
			System.out.println("There is nothing in the stack");		
		}
		*/
		
		
		/*
		Circle circle = new Circle();
		
		
		try {
			circle.setRadius(-5);
		}catch(IllegalArgumentException e) {
			System.out.print("no negative radius input allowed");
		}
		*/
		
		
		/*
		Circle cir = new Circle(7);
		
		GenericStack<Integer> s = new GenericStack<>();
		GenericStack<Double> d = new GenericStack<>();
		GenericStack<Circle> circle = new GenericStack<>();

		System.out.println(s.isEmpty());
		s.push(5);
		s.push(6);
		s.push(7);
		System.out.println(s.peek()); //shows 7 
		System.out.println(s.pop()); // remove 7 and return what is removed == list.remove()
		
		circle.push(cir);
		circle.push(cir);
		circle.push(cir);
		System.out.println(circle.getSize());
		System.out.println(circle.pop().toString());
		*/
		
		
		/*
		GeometricObject g = new GeometricObject();
		System.out.println(g);
		*/
		
		
		/*
		Circle c = new Circle();
		c.setColor("red"); // GeometricObject instance but the circle is inherited
		System.out.println(c);
		System.out.println(c.getColor());
		*/
		
		
		/*
		GeometricObject[] o = new Circle[5];
		
		o[0] = new GeometricObject();
		o[0] = new Circle();
		*/
		
		
		/*
		ComparableRectangle comp = new ComparableRectangle(5,2);
		ComparableRectangle rec = new ComparableRectangle(3,4);
		
		System.out.println(comp.compareTo(rec));
		
		ComparableRectangle[] rectangleList = new ComparableRectangle[2];
		rectangleList[0] = new ComparableRectangle(2,3);
		rectangleList[1] = new ComparableRectangle(1,3);
		
		System.out.println(Arrays.toString(rectangleList));
		System.out.println(rectangleList[0].toString());
		
		Arrays.sort(rectangleList);
		
		System.out.println(Arrays.toString(rectangleList));
		*/
		
		/*
		System.out.println(Integer.valueOf("3").compareTo(2));
		Integer[] intArr = {1,2,3,4,5};
		System.out.println(max(intArr));
		
		String[] strArr = {"w","x","e","z"};
		System.out.println(max(strArr));
		
		ComparableRectangle[] rec = {new ComparableRectangle(2,5), new ComparableRectangle(3,8)};
		System.out.println(max(rec));
		*/
		
		
		
		
	
	
		//old codes
		/*
		ArrayList<Double> arr = new ArrayList<>();
		do {
			double number = input.nextDouble();
			if(number == 0) {
				break;
			}else {
				arr.add(number);
			}
			
		}while(true);
		
		System.out.println(arr.toString());
		*/
		
		
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
		//old codes
		
		
		
		
		
		
		
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
		System.out.println(max(arrLst));// displaying 3
		
		
		
		ArrayList<ComparableRectangle> arrLst2 = new ArrayList <>();
		arrLst2.add(new ComparableRectangle(4,5));
		arrLst2.add(new ComparableRectangle(5,6));
		arrLst2.add(new ComparableRectangle(6,7));
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

	public static <E> void shuffle (ArrayList<E> list) {
		for(int i = 0; i < list.size(); i++) {
			int randNum = (int)Math.random()*list.size();
			
			E temp = list.get(randNum);
			
			list.set(randNum, list.get(i));
			list.set(i, temp);
			
			
			
		}
	}
	/*
	public static <E extends java.lang.Comparable<E>> E max(E[] list) {
		E largest = list[0];
		
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(largest)> 0) {
				largest = list[i];
			}
		}
		
		return largest;
	}
	*/
	
	/*
	public static <E extends java.lang.Comparable<E>> E max(ArrayList<E> list) {
		E largest = list.get(0);
		
		for(int i = 0; i < list.size(); i++) {
			
			if (list.get(i).compareTo(largest) > 0) {
				largest = list.get(i);
			}
		}
		
		return largest;
		
	}
	*/
	
	
}
