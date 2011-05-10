import java.util.NoSuchElementException;

public interface OrderedListInterface<T> {
	// From problem 14.8 in Lewis, DePasquale and Chase
	
	public void add (T element);		
		// Adds an element to the list, keeping the elements in order
	public T remove (T element) throws NoSuchElementException;
		// Removes and returns the specified target element.  Throws an exception if the
		// target is not found in the list.
	public T first () throws NoSuchElementException;
		// Returns the first element in the list without removing it.  Throws an exception
		// if the list is empty.
	public T last () throws NoSuchElementException;
		// Returns the last element in the list without removing it.  Throws an exception
		// if the list is empty.
	public boolean contains (T element);
		// Returns "true" if the list contains a particular element, and "false" otherwise.
	public boolean isEmpty ();
		// Returns "true" if the list is empty, and "false" otherwise.
	public int size ();
		// Returns the current number of elements in the list
	public void printList ();
	    // Prints the ordered list by using the toString for the objects.
}
