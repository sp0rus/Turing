package edu.olemiss.cs211.a1;

import edu.olemiss.cs211.a1.AdjacencyList.NodeNeighbors;


public class CityList extends OrderedList<City> {
		
	public void clearVisited(){
		
		for(City c: this){
			
			c.setVisited(false);
		}
	}
	
//	public City getIndexed(int n)  {
//		
//		if (n >= this.size() || n < 0) {
//			
//			throw new java.util.NoSuchElementException();
//		}
//			
//		// This is very inefficient
//		int i=0;
//		for(City c: this){
//			
//			if(i==n) {
//				return c;
//			}
//			
//			i++;
//		}
//		
//		return new City("");
//	}

	
	public City find(String cityName){

		// Hmm. Is there a better data structure for supporting
		// this operation?
		for(City c: this){
			
			if(c.name.equals(cityName)){
				return c;
			}
		}
		
		return null;
	}
	
}

