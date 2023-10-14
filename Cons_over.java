import java.util.*;
class Overloading
{
	int length;
	int breadth;
	Overloading()
	{
		length=10;
		breadth=20;
	}
	Overloading(int l, int b)
	{
		length=l;
		breadth=b;
	}
	Overloading(Overloading obj)
	{
		length=obj.length;
		breadth=obj.breadth;
	}
	void print()
	{
		System.out.println("The length is: "+length);
		System.out.println("The breadth is: "+breadth);
		int area;
		area=length*breadth;
		System.out.println("The area of rectangle is: "+area);
	}
}
class Cons_over
{
	public static void main(String args[])
	{
		Overloading O=new Overloading();
		Overloading O1=new Overloading(5,10);
		Overloading O2=new Overloading(O1);
		O.print();
		O1.print();
		O2.print();
	}
}