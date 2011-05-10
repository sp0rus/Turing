package edu.olemiss.cs211.a1;


public class OrderedList<T extends Comparable<? super T>> extends List<T> {
	
	public void add(T o){
		
		ListNode<T> cur = head;
		ListNode<T> prev = null;
		
		while( cur!=null && ((T)cur.data).compareTo(o) < 0 ) {
			
			prev = cur;
			cur = cur.next;
		}
		
		// Check for duplicates
		if( cur!=null && ((T)cur.data).compareTo(o) == 0 ) {
		
			return; // don't insert, it's already there.
		}

		
		if(prev == null){ // should insert at head
			
			ListNode<T> n = new ListNode<T>(o, cur);
			head = n;
		} else {

			ListNode<T> n = new ListNode<T>(o, cur);
			prev.next = n;			
		}

		this.size++;
		return;
	}

}
