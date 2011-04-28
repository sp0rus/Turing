package edu.olemiss.cs211.a1;

import java.util.NoSuchElementException;


public class Stack<T> extends List<T>{
	
	public Stack(){
		head=null;
	}
	
	public boolean isEmpty(){
			return head == null;
	}
	public T pop()throws NoSuchElementException{
		if( isEmpty() ){
			throw new NoSuchElementException();
		}
		T temp = head.data;
		head = head.next;
		return temp;
	}
	public void push(T data){
		head = new ListNode<T>(data, head);
	}
	public void main(){
		Stack<T> StackOne = new Stack<T>();
		
		
	}
}


