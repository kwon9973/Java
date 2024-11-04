package week_3;

import java.util.ArrayList;

public class MyStack {
	private ArrayList<Object> list = new ArrayList<>();
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public int getSize() {
		return list.size();
	}
	public Object peek() {
		return list.get(list.size()-1);
	}
	public Object pop() {
		return list.remove(list.size()-1);
	}
	public void push(Object o) {
		list.add(o);
	}
	public ArrayList <Object> getList(){
		return list;
	}
	public String toString() {
		return "" + list;
	}
}
