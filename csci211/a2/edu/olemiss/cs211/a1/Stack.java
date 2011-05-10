package edu.olemiss.cs211.a1;

public class Stack<T> extends List<T> {
	
	public Stack(){
		
		
	}
	
	public void push(T e){
		
		this.add(e);
	}
	
	public T pop(){
		
		if(head != null){
			
			ListNode<T> n = head;
			head = n.next;
			
			this.size--;
			return n.data;
		} else {
			
			throw new java.util.NoSuchElementException();
		}
	}
	
}
