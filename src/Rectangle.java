
public class Rectangle{
	
	 private double length;
	 private double width;
	 
	 public Rectangle() {  // constructor
		 
		 length=0;
		 width=0;
		  
	 }
	 
	
	 public Rectangle(double l , double w) { //constructor
		 setDimension(l,w);
		 
	 }
	 
	 public void setDimension(double l , double w) {
		
		 if( l >= 0)
			 length=l;
		 else 
			 length=0;
		 
		 if ( w >=0)
			 width=w;
		 else 
			 width=0;
			 
		 
	 }
	 public double getLength() {
		 
		 return length;
	 }
	  public double getWidth() {
		  return width;
	  }
	  
	  public double area() {
		 return length *width;  
	  }
	  
	  public double perimeter() {
		  return (length + width)* 2;
	  }
	  
	  public String toString() { 
		  return ("length = " + length + ", width= "+ width);
	  }
	 
	 



}
