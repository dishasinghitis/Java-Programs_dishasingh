import java.util.Scanner;
class Rectangle
{
	int len, brdth;
	Rectangle(int l, int b)
	{
		len=l;
		brdth=b;
	}
	void area()
	{
		int rectarea =len*brdth;
		System.out.println("Area of the rectangle is: "+rectarea);
	}

	public static void main(String args[])
	{
		rect firstrect=new rect();
		firstrect.setData(50,6);
		firstrect.area();
	}

}
class Rect_area
{
	
}