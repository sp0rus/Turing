/****************************************************
* NAME: John Stitt jmstitt@gmail.com
* EXERCISE NUMBER: 5
* PROGRAM TITLE/TOPIC: Linked List Modification
* COURSE INFORMATION: CSCI 112; Summer 2010
* INSTRUCTOR: James Church (jcchurch@olemiss.edu)
* CURRENT DATE: 2010-07-28
*
* HONOR CODE STATEMENT:
* In keeping with the Honor Code policies of the University of
* Mississippi, the School of Engineering, and the Department of
* Computer and Information Science, I affirm that I have neither
* given nor received assistance on this programming exercise.
*
* PROGRAM DESCRIPTION:
* [Brief description of what this program does.]
****************************************************/

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
			System.out.println( "Error getting value: Out of Bounds at position: " + pos );
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
			System.out.println( "Error setting value: Out of Bounds at position: " + pos );
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
			System.out.println( "Error removing: Out of Bounds at position: " + pos );
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
		return value;
	}
	public void insert(int pos, int value){
		if( pos < 0 || pos > size ){
			System.out.println( "Error inserting: out of bounds at position: " + pos );
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
	public void removeEach(int value){
		int i = 0;
		while( i < size()  ){
			if( get(i) == value )
				remove(i);
			else
				i++;
		}
	}
	public void unique(){
		int i = 0;
		while( i < size() ){
			int value = remove(i);
			removeEach(value);
			insert(i, value);
			i++;
		}
	}
}