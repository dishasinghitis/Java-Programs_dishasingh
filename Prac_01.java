import java.util.*;
class a
{
	int a;
	int b;
	int c;
	void get()
	{
		a=20;
		b=30;
		c=40;
		System.out.println("The three numbers are: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
	}
	void fun()
	{
		int d;
		d=a+b+c;
		System.out.println("The sum of the three numbers is: "+d);
	}
	void fun1()
	{
		int e;
		e=a*b*c;
		System.out.println("The product of the three numbers is: "+e);
	}
}
class Prac_01
{
	public static void main(String args[])
	{
		a A=new a();
		A.get();
		A.fun();
		A.fun1();
	}
}