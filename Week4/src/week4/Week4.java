package week4;

import java.util.Arrays;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.HashSet;


public class Week4 {
	
	public static void main(String[] args) {
		
		/*
		House arr = new House(0,10);
		House clone = (House)arr.clone();
		
		Date date = new Date(123);
		
		System.out.println(arr.getWhenBuilt());
		System.out.println(clone.getWhenBuilt() + "\n");
		
		date.setDate(456);
		arr.setWhenBuilt(date);
		
		System.out.println(arr.getWhenBuilt());
		System.out.println(clone.getWhenBuilt());
		*/
		
		
		
		/*
		Circle circle = new Circle();
		Circle circleClone = (Circle)circle.clone();
		
		System.out.println(circle.getDate());
		System.out.println(circleClone.getDate());
		*/
		
		
		
		/*
		Circle circle = new Circle(3);
		Circle circle2 = new Circle(4);
		Circle circle3 = new Circle(5);
		
		ArrayList <Circle> circleList = new ArrayList<>();
		circleList.add(circle);
		circleList.add(circle2);
		circleList.add(circle3);
		
		Iterator<Circle> iterator = circleList.iterator();
		
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		*/
		
		/*
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(0,10);
		list.add(1,20);
		
		System.out.print(list);
		*/
		
		/*
		Integer[] arr = {1,2,3,4,5};
		
		ArrayList <Integer> arraylist = new ArrayList<>(Arrays.asList(1,2,3,4));
		System.out.println(arraylist);
		
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		*/
		
		/*
		LinkedList <Circle> ll = new LinkedList<>();
		ll.add(new Circle(5));
		ll.add(new Circle(6));
		ll.add(new Circle(7));
		ll.add(new Circle(8));
		
		ListIterator<Circle> iterator = ll.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("----------------------");
		
		
		iterator = ll.listIterator(ll.size());
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		*/
		
		/*
		Circle c = new Circle(7);
		Rectangle r = new Rectangle(5,7);
		
		GeometricComparator C = new GeometricComparator();
		
		System.out.print(C.compare(c, r));
		System.out.print(min(c,r,C).toString());
		*/
		
		/*
		ArrayList <GeometricObject> object = new ArrayList <>();
		
		object.add(new Circle());
		object.add(new Rectangle(2,3));
		object.add(new Rectangle(3,4));
		object.add(new Circle(7));
		
		Collections.sort(object, new PerimeterComparator());
		System.out.print(object);
		*/
		
		/*
		Stack stack = new Stack();
		
		stack.push(23);
		stack.push(4);
		stack.push(65);
		
		System.out.println(stack.search(65));
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		*/
		
		
		/*
		Queue<String> queue = new Queue<>();
		
		queue.offer("lawton");//1
		queue.offer("Tulsa");//3
		queue.offer("OklahomaCity");//2
		queue.offer("Norman");//4
		
		while(queue.size() > 0) {
			System.out.println(queue.remove());
		}
		System.out.print(queue.isEmpty());
		*/
		
		
		
		/*
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		queue.offer(12);
		queue.offer(13);
		queue.offer(14);
		queue.offer(9);
		queue.offer(10);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		*/
		
		/*
		PriorityQueue<GeometricObject> queue = new PriorityQueue<>(new PerimeterComparator());
		
		queue.offer(new Circle(2));
		queue.offer(new Circle(3));
		queue.offer(new Circle(4));
		queue.offer(new Rectangle(2,6));
		queue.offer(new Rectangle(2,10));
		
		while(queue.size() > 0) {
			System.out.println(queue.remove().getArea());
		}
		*/
		
		
		/*
		HashSet<Integer> h = new HashSet();
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		
		HashSet<Integer> h2 = new HashSet();
		h2.add(2);
		h2.add(6);
		h2.add(3);
		h2.add(4);
		h2.add(5);
		
		System.out.println(h);
		System.out.println(h2);
		
		h.addAll(h2);
		System.out.println(h);
		
		h.removeAll(h2);
		System.out.println(h);
		
		h.retainAll(h2);
		System.out.println(h);
		*/
		
		
		
	}
	/*
	public static GeometricObject min(GeometricObject a, GeometricObject b, Comparator<GeometricObject> C) {
		if(C.compare(a, b) > 0) {
			return b;
		}else {
			return a;
		}
	}
	*/

}
