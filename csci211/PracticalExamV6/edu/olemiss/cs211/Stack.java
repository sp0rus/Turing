package edu.olemiss.cs211;


/** A list that implements push() and pop() stack operations.
 * 
 * @author rhodes
 *
 * @param <T>  The type of the stack elements
 */
public class Stack<T> extends List<T> {
	
	//public Stack(){}
	
	/** Push the argument onto the top of stack.
	 * @param e The element to be pushed.
	 */
	public void push(T e){
		
		this.add(e);
	}
	
	
	/** Pop an element from the top of the stack.
	 *  The topmost element is removed and returned.
	 * @return the element that was at the top of the stack.
	 */
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
