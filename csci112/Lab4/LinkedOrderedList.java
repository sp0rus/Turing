// There are some warnings in this class (unless you suppress them), but don't worry
// about them.

// Fill in the missing methods.

import java.util.NoSuchElementException;

public class LinkedOrderedList<T> implements OrderedListInterface<T> {
	
	private int count;
	private Node<T> head;
	
	public LinkedOrderedList() {
		count = 0;
		head = null;
	}
	
	public void add (T element) {
		if (head == null) {        // first element
			head = new Node<T>(element);
		}
		else {          // find location to insert
			Node<T> current = head;
			if (((Comparable) element).compareTo(current.data)<0) {     // insert before head
				Node<T> newHead = new Node<T>(element);
				newHead.next = head;
				head = newHead;
			}
			else {                          // step through list to find right spot
				Node<T> prev = current;
				while (current.next != null && ((Comparable) current.data).compareTo(element) < 0) {
					prev = current;
					current = current.next;
				}
				// insert after previous
				Node<T> newNode = new Node<T>(element);
				newNode.next = prev.next;
				prev.next = newNode;
			}
		}
		count++;
	}
	
	public T remove (T element) throws NoSuchElementException {
		Node<T> deleteMe = find(element);
		if (deleteMe == null) {
			throw new NoSuchElementException("Data not found to remove.");
		}
		else {
			if (head==deleteMe) {   // delete first node
				head = head.next;
			}
			else {
				Node<T> current = head;
				while (current.next != deleteMe) {     // traverse list to find node
					current = current.next;
				}
				current.next = current.next.next;      // delete node after current
			}
			count--;
			return deleteMe.data;
		}
	}
	
	public T first () throws NoSuchElementException {
		// TODO: fill in this method.  It should throw an exception if
		//       the list is empty; otherwise return the first element 
		//       in the list
		if (head == null)
		{
			throw new NoSuchElementException("The list is empty");
		}
		else
			return head.data;
	}

	public T last () throws NoSuchElementException {
		// TODO: fill in this method.  It should throw an exception if
		//       the list is empty; otherwise traverse the list and return 
		//       the last element in the list		
		if (head == null)
		{
			throw new NoSuchElementException("The list is empty");
		}
		else
		{
			Node<T> current = head;
        	while (current.next != null)
        	{
        		current = current.next;
        	}
        	return current.data;
		}
	}
	
	public boolean contains (T element) {
		// TODO:  fill in this method.  It is simple if the "find" method is used.
		if(find(element)!= null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmpty () {
		// TODO:  fill in this method.
		return head.next == null;
	}
	
	public int size () {
		// TODO:  fill in this method
		return count;
	}
	
	public void printList () {
		// TODO:  fill in this method.  Print out a "List is empty" message if there
		//        are no entries in the list.  Otherwise, traverse the list and print
		//        each element.  You can assume a "toString" is available in the generic
		//        class T.
		if( head == null)
            System.out.print( "Empty list" );
        else
        {
        	Node<T> current = head;
        	while (current.next != null)
        	{
        		current = current.next;
        		System.out.print(current.toString());
        	}
        }

        System.out.println( );
	 }
	
	private Node<T> find(T element) {
		Node<T> current = head;
		while (current.next != null && ((Comparable)current.data).compareTo(element)<0){
			current = current.next;
		}
		if (((Comparable)current.data).compareTo(element) == 0)
			return current;
		else
			return null;
	}
}
