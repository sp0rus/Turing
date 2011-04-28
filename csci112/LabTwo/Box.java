
public class Box 
{

	private double height;
	private double width;
	private double depth;
	private boolean full;
	
	//constructor
	public Box (double h, double w, double d)
	{
		height = h;
		width = w;
		depth = d;
	}
	
	//accessors and mutators
	public void setHeight (double h)
	{
		height = h;
	}
	public void setWidth (double w)
	{
		width = w;
	}
	public void setDepth (double d)
	{
		depth = d;
	}
	
	public void setFull (boolean f)
	{
		full = f;
	}

	public double getHeight ()
	{
		return height;
	}
	public double getWidth ()
	{
		return width;
	}
	public double getDepth ()
	{
		return depth;
	}
	public boolean getFull ()
	{
		return full;
	}
	
	public double getVolume ()
	{
		double volume = (height*width*depth);
		return volume;
	}
	
	public String toString ()
	{
		if (full)
		{
			return ("Box is " + height + " high by " + width + " wide by " + depth + " deep and FULL");
		}
		else
		{
			return ("Box is " + height + " high by " + width + " wide by " + depth + " deep and NOT full");
		}
	}
}

