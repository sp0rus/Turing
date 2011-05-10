
    
import java.util.*;
public class BinaryTreeNode<T extends Comparable<T>>
{
	//instance variable
	private BinaryTreeNode<T> left, right;
	private T data;

	public BinaryTreeNode(T element)//sets up the root of the binary tree
	{
		data = element;
		left = null;
		right = null;
	}
	public BinaryTreeNode()//empty node
	{
		data = null;
		left = null;
		right = null;
	}
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

}
