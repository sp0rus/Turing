package shape;

public abstract class Shape {
	private int x;	//x coordinate
	private int y;	//y coordinate
	
	//two argument constructor
	public Shape( int x, int y ){
		this.x = x;
		this.y = y;
	}
	//set x coordinate
	public void setX( int x ){
		this.x = x;
	}
	//set y coordinate
	public void setY( int y ){
		this.y = y;
	}
	//get x coordinate
	public int getX(){
		return x;
	}
	//get y coordinate
	public int getY(){
		return y;
	}
	// return String representation of Shape object
	public String toString(){
	    return String.format( "[%d, %d]", getX(), getY() );
	}
	// abstract methods
	   
	// return the area of the Shape
	public abstract double area();
	// return the perimeter of the Shape
	public abstract double perimeter();
}
