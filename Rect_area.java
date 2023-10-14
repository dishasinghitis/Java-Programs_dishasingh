import java.util.Scanner;
class Rectangle
{
	int len, brdth;
	Rectangle(int l, int b)
	{
		len=l;
		brdth=b;
	}
	Rectangle(int x)
	{
		len=x;
		brdth=x;
	}
	void area()
	{
		int rectarea =len*brdth;
		System.out.println("Area of Rectangle: "+rectarea);
	}
}
class Rect_area
{
	public static void main(String args[])
	{
		Rectangle firstrect1= new Rectangle(4,5);
		Rectangle firstrect2= new Rectangle(4);
		firstrect1.area();
		firstrect2.area();
	}
}