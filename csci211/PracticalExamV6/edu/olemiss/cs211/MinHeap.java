package edu.olemiss.cs211;


/**
 * Min heap implementation 
 *
 * @param <T>
 */
public class MinHeap<T extends Comparable<T>>  {
	
	private BinaryTreeNode<T> root,last;//last is used to record the last leaf in the tree
	
	/**
	 * method to insert element into heap
	 * @param element
	 */
	public void add(T element)
	{
		
		BinaryTreeNode<T> newnode=new BinaryTreeNode<T>(element);
		if(root==null)
		{
			root=newnode;
			last=root;
		}
		else
		{
			BinaryTreeNode<T> parent=getParentAdd();//gets the parent to attach the new node (complete BT fashion)
			if(parent.getLeft()==null)
				parent.setLeft(newnode);
			else
				parent.setRight(newnode);
			newnode.parent=parent;//setting the parent for the node
			last=newnode;//critical
			this.heapifyAdd();
		}		
		
	}
	
	/**
	 * Remove the root node from the heap. 
	 * @return the removed root node's value
	 */
	public T remove()
	{
		T minElement =root.getData();
		if (root.getLeft()==null)
			root=last=null;
		else
		{
			BinaryTreeNode<T> newLast=getNewLastNode();
			if (last.parent.getLeft() == last)
				last.parent.setLeft(null);
			else
				last.parent.setRight(null);
			root.setData(last.getData());
			last=newLast;
			heapifyRemove();
		}
		return minElement;
		
		
	}
	/**
	 * This method moves the smallest node upwards to its right position
	 */
	private void heapifyAdd()
	{
		T temp;
		BinaryTreeNode<T> current=last;
	
		
		//check if newnode data is less than parents data then interchange it(only the data) with parent
			while( (current.parent!=null)&&(current.getData().compareTo(current.parent.getData())<0))
			{
				temp=current.getData();				
				current.setData(current.parent.getData());
				current.parent.setData(temp);
				current=current.parent;//iteration
			}		
		
	}
	/**
	 * method which returns a parent where we can add the new element 
	 * @return
	 */
	
	private BinaryTreeNode<T> getParentAdd()
	{
		 
		BinaryTreeNode<T> result=last;
			/*loop goes upward until a position 
			 * from where to go getLeft() downwards towards the position for the new node to be inserted*/
			while((result.parent!=null) && (result.parent.getLeft()!=result))		
				result=result.parent;
			
			if(result.parent !=null )
				if(result.parent.getRight() ==null)
					result=result.parent;
				else
				{
					result=result.parent.getRight();
					while(result.getLeft()!=null)
						result=result.getLeft();
				}
			else
				/*this loop dives until we find the leftmost position to insert node in complete Binary tree fashion*/
				while(result.getLeft()!=null)
					result=result.getLeft();
		
		return result;
		
	}
	
	
	/**
	 *  
	 * @return the previous in the level-order or the new last node 
	 * after we move the last node to the root position
	 */

	private BinaryTreeNode<T> getNewLastNode()
	{
		BinaryTreeNode<T> result=last;
		while((result.parent !=null)&& (result.parent.getLeft() ==result))
			result=result.parent;
		if(result.parent !=null)
			result=result.parent.getLeft();
		while(result.getRight()!=null)
			result=result.getRight();		
		return result;
	}
	
	/**
	 * method iteratively moves the smaller child upwards to the right postion to maintain the min heap
	 */
	private void heapifyRemove()
	{
		T temp;
		BinaryTreeNode<T> current=root;
		BinaryTreeNode<T> next =current.smallerChild();//finds the smaller node to move up
		//loop to iteratively move the root node(only data) downwards 
		while((next!=null)&& next.getData().compareTo(current.getData())<0)
		{
			temp=current.getData();
			current.setData(next.getData());
			next.setData(temp);
			current=next;
			next=current.smallerChild();
			
		}
	}
	
	

}
