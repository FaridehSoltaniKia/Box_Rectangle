
public class Example7_1 {

	public static void main(String[] args) {
		Rectangle myRectangle1= new Rectangle();
		Rectangle myRectangle2= new Rectangle(8,6);
		
		Box myBox1=new Box();
		Box myBox2=new Box(10,7,3);
		
		System.out.println("MyRectangle="+myRectangle1 );
		System.out.println("Area of MyRectangle="+myRectangle1.area() );
		
		System.out.println("MyRectangle="+myRectangle2 );
		System.out.println("Area of MyRectangle="+myRectangle2.area() );
		
		System.out.println("myBox1:" + myBox1);
		System.out.println("Surface Area of myBox1 :"+ myBox1.area());
		System.out.println("volume of myBox1 :"+ myBox1.volume());
		
		System.out.println("myBox2:" + myBox2);
		System.out.println("Surface Area of myBox2 :"+ myBox2.area());
		System.out.println("volume of myBox2 :"+ myBox2.volume());

	}
}
