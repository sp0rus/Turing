package edu.olemiss.cs211;  

import java.util.*;
import java.util.concurrent.*;

/**
 * Binary Search Tree implementation 
 *
 * @param <T>
 */
public class BinarySearchTree<T extends Comparable<T>> 
{
	//instance variables
	private BinaryTreeNode<T> root;
	private int count = 0;
	private int height = 0;
	private int maxHeight = 0;
	
	/**
	 *Creates an empty binary search Tree
	 */
	public BinarySearchTree()
	{
		root=null;
	}

	/**
	 * method that
	 * @return the number of nodes in the tree
	 */
	public int size()
	{
		return count; //returns the number of nodes in the tree
	}

	/**
	 * method to check if the Tree is empty
	 * @return true for empty Tree
	 */
    public boolean isEmpty()
	{
		if(root==null)
			return true;
		return false;
	}
    
    /**
     * Inserts an element of type T into the Binary Search Tree
     * @param element of comparable type T
     * @return True if insertion was successful
     */
    public boolean add(T element)//calls the private method of add
	{
    	BinaryTreeNode<T> newNode = new BinaryTreeNode<T>(element);
    	if(root==null)//the tree is empty
		{
			root = newNode;
			count++;
		}
    	else{
		add(element, root);
    	}
		return true;
	}
    
    /**
     * overloaded version which enables recursive lookup of the tree to find the place to insert the element
     * @param element to be inserted
     * @param root  passed to denote the tree on which we are performing the insertion
     * @return  true if operation was successful
     */
	private boolean add(T element, BinaryTreeNode<T> root)//adds and element to the binary tree
	{
		BinaryTreeNode<T> newNode = new BinaryTreeNode<T>(element);
		if(root==null)//the tree is empty
		{
			root = newNode;
			count++;
		}
		else if(root.getData().compareTo(newNode.getData())==0)//duplicate node in the tree
		{
			System.out.println("The element you are entering is already in the tree.");
		}
		else if(root.getData().compareTo(newNode.getData())<0)//the node is larger than root and go right
		{
			if(root.getRight()==null)//no right child originally
			{
				root.setRight(newNode);
				count++;
			}
			else//there is a right child so we go back through add
			{
				add(element, root.getRight());
			}
				
		}
		else if(root.getData().compareTo(newNode.getData())>0)//the node is smaller than root and go left
		{
			if(root.getLeft()==null)//no left child originally
			{
				root.setLeft(newNode);
				count++;
			}
			else//there is a left  child so we go back through add
			{
				add(element, root.getLeft());
			}
		}
		return true;		
	}
    
	/**
	 * searches the binary search tree recursively for the element
	 * @param element
	 * @return true if the element is present
	 */
	public boolean find(T element)
	{
		return find(element, root);
	}
	private boolean find(T element, BinaryTreeNode<T> root)
	{
		if(root.getData().compareTo(element)==0)//element is the root
			return true;
		else if(root.getData().compareTo(element)<1)//element is bigger than the root therefore we go right
			if(root.getRight()!=null)
				return find(element, root.getRight());
			else
				return false;
		else//element is less than the root therefore we go left
			if(root.getLeft()!=null)
				return find(element, root.getLeft());
			else
				return false;
	}
	
	/**
	 * prints the data in the nodes encountered during the pre-order traversal of the tree
	 */
	public void printPreorder()
	{
		printPreorder(root);
	}
	private void printPreorder(BinaryTreeNode<T> root)
	{
		if(root!=null)//checks for an empty tree
		{
			System.out.println(root.getData());//prints the node of the tree
			if(root.getLeft()!=null)//checks for left children
				printPreorder(root.getLeft());
			if(root.getRight()!=null)//checks for right children
				printPreorder(root.getRight());
		}
	}
	
	/**
	 * prints the data in the nodes encountered during the in-order traversal of the tree
	 */
    public void printInorder()
	{
		printInorder(root);
	}
	private void printInorder(BinaryTreeNode<T> root)
	{
		if(root!=null)//check for an empty tree
		{
			if(root.getLeft()!=null)//checks the left child
				printInorder(root.getLeft());
			System.out.println(root.getData());//prints the node
			if(root.getRight()!=null)//checks the right child
				printInorder(root.getRight());
		}
	}
	/**
	 * prints the data in the nodes encountered during the post-order traversal of the tree
	 */
    public void printPostorder()
	{
		printPostorder(root);
	}
	private void printPostorder(BinaryTreeNode<T> root)
	{
		if(root!=null)//check for an empty tree
		{
			if(root.getLeft()!=null)//chcks the left child
				printPostorder(root.getLeft());
			if(root.getRight()!=null)//checks the right child
				printPostorder(root.getRight());
			System.out.println(root.getData());//prints the node
		}
	}
	
	/**
	 * prints the data in the nodes encountered during the level-order traversal of the tree
	 */
	public void printLevelOrder()
	{
		LinkedBlockingQueue<BinaryTreeNode> queue=new LinkedBlockingQueue<BinaryTreeNode>();
		BinaryTreeNode current=new BinaryTreeNode();//used to iterate
		queue.offer(root);//enqueue root
		while(!queue.isEmpty() )
		{
			current=queue.poll();
			System.out.println(current.getData());
			if(current.getLeft()!=null )
			queue.offer(current.getLeft());
			if( current.getRight()!=null)
			queue.offer(current.getRight());
			
		}
	}
	
	
   
}