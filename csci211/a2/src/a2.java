import edu.olemiss.cs211.a1.*;


public class a2 {
	
	public static void main(String args[]){
		
		//test();
		run();
	}
	
	/** This method repeatedly loads city and adjacency information
	 * from standard input, and then repeatedly answers queries consisting
	 * of pairs of cities. The user will then be informed whether
	 * a path exists between a city pair. If a path exists, the user
	 * will be given an actual path as a list of cities. 
	 */
	public static void run(){
		
		AdjacencyList<City> adj = new AdjacencyList<City>();
		Stack<String> path = new Stack<String>();
		A2Reader r = new A2Reader();
		
		r.readAdjacencies(adj);
		
		City c1 = r.readCity();
		City c2 = r.readCity();
		boolean p;
		
		while (c1 != null && c2 != null) {

			p = pathExists(adj, c1, c2,  path);		
			
			if (p){
			
				System.out.println("One possible path from "+c1+" to "+c2+" is: " + path);
			} else {
				
				System.out.println("No path exists from "+c1+" to "+c2);
			}
			System.out.println();
			
			c1 = r.readCity();
			c2 = r.readCity();
			
			path = new Stack<String>();
			r.clearVisited();
		}
		
		
		System.out.println("Done.");
	}
	
	/** Just a testbench. Use it if you like. */
	public static void test(){
		
		AdjacencyList<City> adj = new AdjacencyList<City>();
		Stack<String> path = new Stack<String>();

		
		City denver = new City("Denver");
		City anaheim = new City("Anaheim");
		City berlin = new City("Berlin");
		City chicago = new City("Chicago");

		
		
		adj.setAdjacent(anaheim, berlin);
		adj.setAdjacent(anaheim, chicago); 
		adj.setAdjacent(chicago, anaheim);
		
//		adj.setAdjacent(berlin, chicago);  // Berlin  --> Chicago
//		
//		adj.setAdjacent(berlin, denver);  // Berlin --> Denver
//		adj.setAdjacent(denver, anaheim);  // Denver --> Anaheim
//		
//		adj.setAdjacent(denver, chicago);  // Denver --> Anaheim

		
		boolean p = pathExists(adj, chicago, berlin,  path);
		
		
		
		if (p){
		
			System.out.print("One possible path is: " + path);
		} else {
			System.out.println("No path exists.");

		}
	}
	
	/** Indicates whether a path exists between the start and end cities, according
	 * to the given adjacency list. If a path does exist, the path parameter will
	 * contain a list of city names on the path in the proper order, and the method
	 * will return true. Otherwise, false is returned.
	 * @param adj
	 * @param start
	 * @param end
	 * @param path
	 * @return
	 */
	private static boolean pathExists(AdjacencyList<City> adj, City start, City end, Stack<String> path){

		// Write Me
		List<City> neighbors = adj.getNeighbors(start);
		for(City neighbor: neighbors){
			if(pathExists(adj, neighbor, end, path)){
				return true;
			}
		} 
		
		return false;
	}
	
}
