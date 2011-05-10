
  

//import java.util.Queue;

public class BinarySearchTree<T extends Comparable<T>> 
{
	//instance variables
	private BinaryTreeNode<T> root;
	private int count = 0;//could be used to keep count of no of nodes inserted 
	

	public BinarySearchTree()
	{
		root=null;
	}

	public int size()
	{
		return count; //returns the number of nodes in the tree
	}

    public boolean isEmpty()//returns true if the tree is empty
	{
		if(root==null)
			return true;
		return false;
	}
    public void  add(T element)//calls the private method of add
	{
    //to be implemented
    	if (root == null) {
    		root = new BinaryTreeNode<T>(element, null, null);
    		count++;
   		} 
    	else {
		BinaryTreeNode<T> current = root;
    		while (current != null) {
    			if(element.compareTo(current.getData())<0){
    				// insert left
    				if (current.getLeft() == null) {
    					current.setLeft(new BinaryTreeNode<T>(element, null, null));
    					count++;
    					return;
    				} 
    				else {
    					current = current.getLeft();
    				}
    			} 
    			else{
    				// insert right
    				if (current.getRight() == null) {
    					current.setRight(new BinaryTreeNode<T>(element, null, null));
    					count++;
    					return;
    				} 
    				else {
    					current = current.getRight();
    				}
    			}
    		}
   		}
   	}
	//add(element, root); //is used ,how exactly is to be figured out
    
	/*	
	private void add(T element, BinaryTreeNode<T> root)//adds and element to the binary tree
	{
		
	}
    */
   
    public void printPreorder()
	{
		printPreorder(root);
	}
	private void printPreorder(BinaryTreeNode<T> root)
	{
		if (root != null) {
			System.out.println("  Traversed " + root.getData());
            printPreorder(root.getLeft());
            printPreorder(root.getRight());
        }
	}
    public void printInorder()
	{
		printInorder(root);
	}
	private void printInorder(BinaryTreeNode<T> root)
	{
		if (root != null) {
            printInorder(root.getLeft());
            System.out.println("  Traversed " + root.getData());
            printInorder(root.getRight());
        }
	}
    public void printPostorder()
	{
		printPostorder(root);
	}
	private void printPostorder(BinaryTreeNode<T> root)
	{
		if (root != null) {
            printPostorder(root.getLeft());
            printPostorder(root.getRight());
            System.out.println("  Traversed " + root.getData());
        }
	}
	public void printLevelOrder(){
		printLevelOrder(root);
	}
	public void printLevelOrder(BinaryTreeNode<T> root){
		Queue<T> q = new Queue<T>(); 
	    q.enqueue(root); 
	    while (!q.isEmpty()) 
	      { 
	        root = q.dequeue(); 
	        System.out.println(root.getData()); 
	        if (root.getLeft() != null) q.enqueue(root.getLeft()); 
	        if (root.getRight() != null) q.enqueue(root.getRight()); 
	      }  
	}
    
    public String toString()
	{
		return "This is a tree of size " + size();
	}
    public T find(T element)
	{
		return find(element, root);
	}
	private T find(T element, BinaryTreeNode<T> root)
	{
		 while( root != null ) {
	            if( element.compareTo( root.getData() ) < 0 )
	                root = root.getLeft();
	            else if( element.compareTo( root.getData() ) > 0 )
	                root = root.getRight();
	            else
	                return root.getData();
	        }
	        
	        return null;
	}
	public int countLeaves(){
		int blarg = countLeaves(root);
		return blarg;
	}
	private int countLeaves(BinaryTreeNode<T> root){
        if (root == null)
           return 0;
        else if (root.getLeft() == null && root.getRight() == null)
           return 1;  // Node is a leaf.
        else
           return countLeaves(root.getLeft()) + countLeaves(root.getRight());
	}
    
    //main method not to be modified when demonstrating to the TA
    public static void main(String[] args)
    {
    	
    	BinarySearchTree<Integer> tree=new BinarySearchTree<Integer>();
    	
    	tree.add(10);
    	tree.add(2);
    	tree.add(5);
    	tree.add(4);
    	tree.add(1);
    	tree.add(15);
    	tree.add(12);
    	System.out.println("Print In-Order Taversal");
    	tree.printInorder();
    	System.out.println();
    	System.out.println("Print Pre-Order Taversal");
    	tree.printPreorder();
    	System.out.println();
    	System.out.println("Print Post-Order Taversal");
    	tree.printPostorder();
    	System.out.println();
    	System.out.println("Print Level-Order Taversal");
    	tree.printLevelOrder();
    	System.out.println();
    	System.out.println(tree);
    	System.out.println();
    	int ahhhhh = tree.countLeaves();
    	System.out.println("There are " + ahhhhh + " leaves in the tree.");
    	System.out.println(tree.find(4));
    	System.out.println(tree.find(6));
    }
}