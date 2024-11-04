package week_3;
import java.util.ArrayList;

public class GenericStack<E> { // by putting <E>, it allows any type.
	private ArrayList <E> list = new ArrayList <E>();
	
	public GenericStack() {}
	public int getSize() {
		return list.size();
	}
	public E peek() {
		return list.get(list.size() - 1);
	}
	public E pop() {
		return list.remove(list.size()-1);
	}
	public void push(E o) {
		list.add(o);
	}
	public boolean isEmpty() {
		if(list.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		return "" + list;
	}
	
}
