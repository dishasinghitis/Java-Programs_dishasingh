import java.util.*;
class Overloading
{
	int l;
	int b;
	Overloading()
	{
		l=10;
		b=20;
	}
	Overloading(int length, int breadth)
	{
		l=length;
		b=breadth;
	}
	Overloading(Overloading obj)
	{
		length=obj.length;
		breadth=obj.breadth;
	}
	void print()
	{
		System.out.println("The length is: "+l);
		System.out.println("The breadth is: "+b);
		int area;
		area=l*b;
		System.out.println("The area of rectangle is: "+area);
	}
}
class Constrtor_overloading
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