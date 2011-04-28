package edu.olemiss.cs211;

import java.util.Iterator;

/** A simple list class */
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

	/** Creates an empty list. */
	public List(){
		head = null;
		size = 0;
	}

	/** Add the given object to the list.
	 * @param o the object to add.
	 */
	public void add(T o){
		
		if (head == null){
			
			head = new ListNode<T>(o, null);		
		} else {
			
			ListNode<T> n = new ListNode<T>(o, head);
			head = n;		
		}
		
		size++;
	}
	
	/** Indicate if the list is empty.
	 * 
	 * @return true if empty. False otherwise.
	 */
	boolean isEmpty(){
		
		return head == null;
	}

	/** Write this list to a string.
	 * @return a string representing this list.
	 * */
	public String toString(){
		
		StringBuffer retVal=new StringBuffer(100);
		
		for(T n: this){
			
			retVal.append(n);
			retVal.append(" ");
		}
		
		return retVal.toString();
	}
	
	/** Return the number of elements in this list.
	 * @return the number of elements in this list. */
	public int size(){
		
		return this.size;
	}
	
	
	/** Returns an iterator for this list. 
	 * @return an iterator for this list. */
	public Iterator<T> iterator() {
		
		return new CS211Iterator<T>(this);
	}
	
	/** Copies this list. However, it
	 * does not actually copy the data itself, just the ListNodes.
	 * @return a new list with references to the same data as this list.
	 */
	public List<T> clone(){
		
		List<T> newList = new List<T>();
		
		cloneHelper(newList, this.head);
		
		return newList;
	}
	
	/** Returns the object that is equal to the given key if it is found in
	 *  the list. Otherwise, returns null. This implementation relies on
	 *  the equals() method of the objects contained in the list.
	 *  @param k an object that serves as a key.  
	 *  @returns an object matching the given key, or null if no match is found.
	 */
	public T find(Object k){

		for(T e: this){
			
			if(e.equals(k)){
				return e;
			}
		}
		
		return null;
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
