package edu.olemiss.cs211.a1;

/** Represents adjacencies between nodes in a graph.*/
public class AdjacencyList<T extends Comparable<? super T>> {
	
	OrderedList<NodeNeighbors> adj; //could we use inheritance instead? It should work.
	
	protected class NodeNeighbors implements Comparable<NodeNeighbors>{
		
		T key;
		OrderedList<T> neighbors=null;		

		NodeNeighbors(T k){
			
			this.key = k;
			this.neighbors = new OrderedList<T>();
		}
		
		@Override
		public int compareTo(NodeNeighbors o) {
			
			return this.key.compareTo(o.key);
		}
		
		public boolean equals(NodeNeighbors o){
			
			if (o == null) {
				return false;
			} else {
				return compareTo(o) == 0;
			}
		}
	}
	
	/** Construct an empty adjacency list. */
	public AdjacencyList(){
		
		this.adj = new OrderedList<NodeNeighbors>();
	}
	
	/** Set an adjacency between node1 and node2 */
	public void setAdjacent(T node1, T node2){
		
		// write me
	}
	
	/** Return a copy of the list of neighbors of the given node.*/
	public List<T> getNeighbors(T node){

		// write me
		return null;
	}
	
	

}
