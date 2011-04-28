package edu.olemiss.cs211.a1;


public class City implements Comparable<City>{
	
	protected String name;
	
	protected boolean visited=false;
	
	public City(String name){
		
		this.name = name;
	}

	public String name(){
		
		return this.name;
	}
		
	public int compareTo(City c){
		
		return  this.name.compareTo(c.name);
	}

	public boolean equals(City o){
		
		if (o == null) {
			return false;
		} else {
			return compareTo(o) == 0;
		}
	}

	public void setVisited(boolean visited){
		
		this.visited = visited;
	}
	
	public boolean isVisited(){
		
		return this.visited;
	}
	
	public String toString(){
		
		return this.name;
	}
}
