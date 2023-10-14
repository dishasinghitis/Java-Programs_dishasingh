import java.util.*;
class b
{
	int l;
	int b;
	int r;
	void get()
	{
		l=10;
		b=8;
		r=5;
		System.out.println("The length of the rectangle is: "+l);
		System.out.println("The breadth of the rectangle is: "+b);
		System.out.println("The radius of the circle is: "+r);
	}
	void fun()
	{
		int area;
		area=l*b;
		System.out.println("The area of rectangle is: "+area);
	}
	void fun1()
	{
		int circum;
		double pie=3.14;
		circum=2*pie*r;
		System.out.println("The circumference of the circle is: "+circum);
	}
}
class Prac_02
{
	public static void main(String args[])
	{
		b B=new b();
		B.get();
		B.fun();
		B.fun1();
	}
}