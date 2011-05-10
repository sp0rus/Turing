package edu.olemiss.cs211.a1;

import java.util.Iterator;


public class List<T> implements Iterable<T> {

	protected ListNode<T> head;
	
	protected int size;

	protected class ListNode<NT extends T>{
		protected NT data;
		protected ListNode<NT> next;
		
		ListNode(NT data, ListNode<NT> next){
			this.data=data;
			this.next=next;
		}
	}

	public List(){
		
	}

	
	
	public String toString(){
		
		StringBuffer retVal=new StringBuffer(100);
		
      // Help, I need more code! 
      
		return retVal.toString();
	}
	
	public int size(){
		size = 0;
		while(List<T>.CS211Iterator.hasNext())
		return this.size;
	}
	
	
	@Override
	public Iterator<T> iterator() {
		
		return new CS211Iterator<T>(this);
	}
	
	public void add(T o) {
		
	}

   // The beginnings of a test method
	public static void main(String args[]){
		
		List<Integer> list1 = new List<Integer>();
		
		list1.add(new Integer(5));
		list1.add(new Integer(3));
		list1.add(new Integer(6));
		list1.add(new Integer(4));
		
		System.out.println(list1);
		System.out.println();

	}


}
