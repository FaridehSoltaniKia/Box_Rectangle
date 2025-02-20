

public class Box extends Rectangle  {
	private double height;
	
	public Box() {
		super();
		height=0;
	}
	public Box(double l, double w, double h) {
		super(l,w);
		height=h;
		
	}
	public void setDimension(double l, double w, double h ) {
		super.setDimension(l, w);
		
		if(h>=0)
			height=h;
		else 
			height=0;
		
	}
	public double getheight() {
		return height;
		
	}
	public double area() {
		return (getLength() * getWidth()) *2 + getLength() * height * getWidth() *height;
	}
	public double volume() {
		return super.area() * height;
	}
	public String toString() {
		return (super.toString() + "; Height = " + height);
	}
	
	

}


