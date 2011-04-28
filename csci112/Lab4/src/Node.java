
public class Node<T> {
     public T data;
     public Node<T> next;
     
     public Node(T newData) {
    	 data = newData;
    	 next = null;
     }
     
     public String toString() {
    	 return data.toString();
     }
}
