package week4;
import java.util.*;


public class Stack <E> {
	private ArrayList <E> arr = new ArrayList<>();
	
	public Stack() {
	}
	public boolean empty() {
		return arr.isEmpty();
	}
	public E pop() {
		return arr.remove(arr.size()-1);
	}
	public E peek() {
		return arr.get(arr.size()-1);
	}
	public void push(E o) {
		arr.add(o);
	}
	public int search(E o) {
		return arr.indexOf(o);
	}
	public String toString() {
		return "" + arr;
	}
}
