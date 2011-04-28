public class SimpleStack<T> {
	
    private StackNode<T> head;
	
    // Constructor
    public SimpleStack() {
	head = null;
    }
	
    public boolean isEmpty() {
    	return head==null;
    }
    
    public void push(T newData) {
        head = new StackNode<T>(newData, head);
    }
    
    public T pop() {
    	if (head==null) {
    		System.out.println("Stack Underflow");
    		return null;
    	}
    	T hold = head.data;
    	head = head.next;
    	return hold;
    }
    
    public T peek() {
        if (head==null) {
        	System.out.println("Stack Underflow");
        	return null;
        }
        return head.data;
    }
}
