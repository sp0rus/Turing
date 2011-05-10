package edu.olemiss.cs211;


import java.util.*;

/**
 * 
 * This is an implementation for the node of a binary tree node
 *
 * @param <T>
 */
class BinaryTreeNode<T extends Comparable<T>>
{
	//instance variable
	private BinaryTreeNode<T> left, right;
	private T data;
	public  BinaryTreeNode<T> parent;//parent node

	/**
	 * this constructor creates a BinaryTreeNode with the data initialized to element passed 
	 * and sets the left and right references to null
	 * @param element 
	 */
	public BinaryTreeNode(T element)//sets up the root of the binary tree
	{
		data = element;
		left = null;
		right = null;
	}
	
	/**
	 * creates an empty node
	 */
	public BinaryTreeNode()//empty node
	{
		data = null;
		left = null;
		right = null;
	}
	
	/**
	 * creates a node with data , left child and right child initialized
	 * @param element the data of the node
	 * @param lc  BinaryTreeNode to placed as the left child of the node
	 * @param rc  BinaryTreeNode to placed as the left child of the node
	 */
	public BinaryTreeNode(T element, BinaryTreeNode<T> lc, BinaryTreeNode<T> rc)//node with exsisting elements
	{
		data = element;
		left = lc;
		right = rc;
	}
	
	
	public void setData(T element)//sets up a node in the tree
	{
		data = element;
	}
	public void setLeft(BinaryTreeNode<T> child)//sets the left child of a node
	{
		left = child;
	}
	public void setRight(BinaryTreeNode<T> child)//sets the right child of a node
	{
		right = child;
	}
	public T getData()//gets the data of the node
	{
		return data;
	}
	public BinaryTreeNode<T> getLeft()//gets the left child of the node
	{
		return left;
	}
	public BinaryTreeNode<T> getRight()//gets the right child of the node
	{
		return right;
	}
	
	/**
	 * find the smaller of the two children 
	 * @return the child node with the least data (among the children)
	 */
	public BinaryTreeNode<T> smallerChild()
	{
		BinaryTreeNode<T> smaller =null;
		if(left==null && right==null)
			smaller=null;
		else if(left==null)
			smaller = right;//because  the tree may not complete
		else if (right==null)
			smaller =left;
		else if (left.data.compareTo(right.data)<0)
			smaller =left;
		else 
			smaller =right;
		
		return smaller;	
		
	}

}

