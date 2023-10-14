import java.util.Scanner;
class rect
{
	int len, brdth;
	void setData(int l, int b)
	{
		len=l;
		brdth=b;
	}
	void area()
	{
		int rectarea =len*brdth;
		System.out.println("Area of the rectangle is: "+rectarea);
	}
}
public class Rect_area_class
{
	public static void main(String args[])
	{
		rect firstrect=new rect();
		firstrect.setData(50,6);
		firstrect.area();
	}
}

