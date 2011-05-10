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
		head = null;
		size = 0;
	}

	public void add(T o){
		
		if (head == null){
			
			head = new ListNode<T>(o, null);		
		} else {
			
			ListNode<T> n = new ListNode<T>(o, head);
			head = n;		
		}
		
		size++;
	}
	
	boolean isEmpty(){
		
		return head == null;
	}

		
	public String toString(){
		
		StringBuffer retVal=new StringBuffer(100);
		
		for(T n: this){
			
			retVal.append(n);
			retVal.append(" ");
		}
		
		return retVal.toString();
	}
	
	public int size(){
		
		return this.size;
	}
	
	
	@Override
	public Iterator<T> iterator() {
		
		return new CS211Iterator<T>(this);
	}
	
	/** Implements a "deep copy" of the list. However, it
	 * does not actually copy the data itself, just the ListNodes.
	 */
	public List<T> clone(){
		
		List<T> newList = new List<T>();
		
		cloneHelper(newList, this.head);
		
		return newList;
	}

	/** Performs the copy operation required by clone(),
	 * preserving the order of the listnodes.
	 * @param list The list that will be the new copy
	 * @param h  A reference to a ListNode.
	 */
	private void cloneHelper(List<T> list, ListNode<T> h){
		
		if(h != null){
			cloneHelper(list, h.next);
			list.add(h.data);
		}
	}
	
	
	public static void main(String args[]){
		
		List<Integer> list1 = new List<Integer>();
		
		list1.add(new Integer(5));
		list1.add(new Integer(3));
		list1.add(new Integer(6));
		list1.add(new Integer(4));
		
		List<Integer> list2 = list1.clone();
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println();

	}


}
