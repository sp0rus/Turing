package edu.olemiss.cs211.a1;

import java.util.*;

public class CS211Iterator<T> implements Iterator<T> {
	
	List<T> theList=null;
	List<T>.ListNode<T> next = null;
	
	public CS211Iterator(List<T> theList){
		
		this.theList = theList;
		this.next = this.theList.head;
	}

	public T next(){
		
		if(hasNext()){
			
			T rval= this.next.data;
						
			this.next = this.next.next;
			 
			return rval;
		} else {
			
			throw new java.util.NoSuchElementException();
		}
	}
	
	public boolean hasNext(){
		
		return this.next != null;
	}
	
	public void remove(){
		
		throw new java.lang.UnsupportedOperationException();
	}

}
