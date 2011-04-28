import java.util.Scanner;

import edu.olemiss.cs211.a1.*;

public class A2Reader {
	
//	int numCities;
	CityList list;
//	AdjacencyList<City> adj;
	Scanner s;
	
	A2Reader(){
		
		this.list = new CityList();
		this.s = new Scanner(System.in);

	}
	
	public void readAdjacencies(AdjacencyList<City> adj){
		
		System.out.print("Number of Cities: ");
		int numCities = s.nextInt();
				
		for(int i=0; i<numCities; i++){
			
			System.out.print("City: ");
			City c = new City(s.next());
			list.add(c);
		}
		
		//System.out.println(list);
		
		System.out.print("Number of Adjacencies: ");
		int numAdjacencies = s.nextInt();
		for(int i=0; i<numAdjacencies; i++){
			
			System.out.print("City: ");
			City c1=list.find(s.next());
			
			System.out.print("City: ");
			City c2=list.find(s.next());
			
			adj.setAdjacent(c1, c2);
			System.out.println("Just set "+c1+" adjacent " + "to " +c2+".");
		}	
	}
	
	public City readCity(){
		
		System.out.print("City: ");
		if(this.s.hasNext()) {
			
			String name = s.next();
			return this.list.find(name);
		} else 
			return null;
	}
	
	public void clearVisited(){
		
		this.list.clearVisited();
	}

}


