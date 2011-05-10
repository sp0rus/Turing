public class StackNode<T> {
	   T data;
	   StackNode<T> next;
	      
	   public StackNode(T d, StackNode<T> n) {
		   data = d;
		   next = n;
	   }
}
