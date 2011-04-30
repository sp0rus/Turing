class LinkedList{
	private class Node{
		public int data;
		public Node next;
		
		public Node(){
			data = 0;
			next = null;
		}
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	private Node head;
	private int size;
	
	public LinkedList(){
		head = null;
		size = 0;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public int size(){
		return size;
	}
	public int get(int pos){
		if( pos < 0 || pos >= size ){
			System.out.println( "Error: Out of Bounds: " + pos );
			System.exit(1);
		}
		Node thisNode = head;
		for( int i = 0; i < pos; i++ ){
			thisNode = thisNode.next;
		}
		return thisNode.data;
	}
	public void set(int pos, int data){
		if( pos < 0 || pos >= size ){
			System.out.println( "Error: Out of Bounds: " + pos );
			System.exit(1);
		}
		Node thisNode = head;
		for( int i = 0; i < pos; i++ ){
			thisNode = thisNode.next;
		}
		thisNode.data = data;
	}
	public int remove(int pos){
		if( pos < 0 || pos >= size ){
			System.out.println( "Error: Out of Bounds: " + pos );
			System.exit(1);
		}
		int value; //stores data being removed
		if(pos == 0){
			value = head.data;
			head = head.next;
		}
		else{
			Node thisNode = head;
			for( int i = 0; i < pos-1; i++ ){
				thisNode = thisNode.next;
			}
			value = thisNode.next.data;
			thisNode.next = thisNode.next.next;
		}
		size--;
		return vlue;
	}
	public void insert(int pos, int value){
		if( pos < 0 || pos > size ){
			System.out.println( "Error: out of bounds: " + pos );
			System.exit(1);
		}
		Node myNode = new Node(value);
		if( pos == 0 ){
			myNode.next = head;
			head = myNode;
		}
		else{
			Node thisNode = head;
			for( int i = 0; i < pos-1; i++ ){
				thisNode = thisNode.next;
			}
			myNode.next = thisNode.next;
			thisNode.next = myNode;
		}
		size++;
	}
}