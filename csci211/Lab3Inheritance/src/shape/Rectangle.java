package shape;

public class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(){
		super(0, 0);
	}
	public Rectangle( int x, int y ){
		super(x, y);
	}
	public Rectangle( int x, int y, int length, int width ){
		super(x, y);
		this.length = length;
		this.width = width;
	}
	public void setLength( int length ){
		this.length = length;
	}
	public void setWidth( int width ){
		this.width = width;
	}
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	public double perimeter() {
		// TODO Auto-generated method stub
		return (2*length)+(2*width);
	}
	public String toString(){
	    return String.format( "[%d, %d, %d, %d]", getX(), getY(), getLength(), getWidth() );
	}
}
