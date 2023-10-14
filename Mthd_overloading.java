import java.util.*;
class Mthd
{
	int l=15;
	int b=30;
	void fun()
	{
		l=20;
		b=30;
		System.out.println("The 1st function is invoked");
		System.out.println("l= "+l);
		System.out.println("b= "+b);
	}
	void fun(int a)
	{
		l=a;
		System.out.println("The 2nd function is invoked");
		System.out.println("l= "+l);
	}
	void fun(int a,int b)
	{
		l=a;
		b=b;
		System.out.println("The 3rd function is invoked");
		System.out.println("l= "+l);
		System.out.println("b= "+b);
	}
}
class Mthd_overloading
{
	public static void main(String args[])
	{
		Mthd A=new Mthd();
		A.fun();
		A.fun(10);
		A.fun(10,20);
	}
}