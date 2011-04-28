
public class Stack {
	private final int MAX_SIZE = 100;
	private int[] elements;
	private int top;
	
	public Stack(){
		elements = new int[MAX_SIZE];
		top = 0;
	}
	
	public boolean isEmpty(){
			return top == 0;
	}
	public boolean isFull(){
		return top == MAX_SIZE;
	}
	public int size(){
		return top;
	}
	
	public int peek(){
		if( isEmpty() ){
			System.out.println( "Nothing to see here, folks. Stack's Empty." );
			System.exit(1);
		}
		return elements[top-1];
	}
	public int pop(){
		if( isEmpty() ){
			System.out.println( "Unlike Pringles, once you pop the fun can stop. Stack's Empty." );
			System.exit(1);
		}
		top--;
		return elements[top];
	}
	public void push(int data){
		if( isFull() ){
			System.out.println( "She's gonna blow cap'n! There's no more room! Stack's full." );
			System.exit(1);
		}
		elements[top] = data;
		top++;
	}
}

