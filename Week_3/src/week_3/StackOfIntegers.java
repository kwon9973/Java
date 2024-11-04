package week_3;

import java.util.EmptyStackException;

public class StackOfIntegers {
	private int[] elements;
	private int size = 0;
	
	public StackOfIntegers() {
		elements = new int[16];
	}
	
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	
	public boolean empty() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int peek() {
		if(size == 0) {
			throw new EmptyStackException();
		}
		return elements[size - 1];
	}
	
	public void push (int value) {
		if(size == elements.length) {
			System.out.println("cannot add anymore; stack is full.");
		}else {
			elements[size] = value;
			size++;
		}
	}
	
	
	public int pop() {
		if(size == 0) {
			throw new EmptyStackException();
		}
		size --;
		return elements[size];
		
	}
}
