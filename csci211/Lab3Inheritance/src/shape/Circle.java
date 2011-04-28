package shape;

public class Circle extends Shape{
	private int radius;
	public Circle(){
		super(0, 0);
	}
	public Circle( int radius ){
		super(0,0);
		this.radius = radius;
	}
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public void setRadius( int radius ){
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(Math.PI*getRadius(), 2);
	}
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*getRadius();
	}
	public String toString(){
	    return String.format( "[%d, %d, %d]", getX(), getY(), getRadius() );
	}
}
