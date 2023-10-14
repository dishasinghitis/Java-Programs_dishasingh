//SINGLE LEVEL INHERITANCE
import java.util.*;
class Base
{
	int roll;
	String name;
	void fun()
	{
		roll=10;
		name="disha";
		System.out.println("The student details are as follows: ");
		System.out.println("Roll no. : "+roll);
		System.out.println("Name : "+name);
	}
	
}
class Derived extends Base
{
	int result;
	int marks1=28, marks2=30;
	void fun1()
	{
		System.out.println("The student result is as follows: ");
		System.out.println("Marks in subject 1: "+marks1);
		System.out.println("Marks in subject 2: "+marks2);
		result=marks1+marks2;
		System.out.println("The total marks: "+result);
	}
}
class Inhrtnce
{
	public static void main(String args[])
	{
		Derived d=new Derived();
		d.fun();
		d.fun1();
	}
}