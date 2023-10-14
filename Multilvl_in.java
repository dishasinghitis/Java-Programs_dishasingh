// Multilevel Inheritance
import java.util.*;
class University
{
	String uni;
	Scanner sc=new Scanner(System.in);
	
	void get()
	{
		System.out.println("Enter the name of the University: ");
		uni=sc.nextLine();
	}
}
class School extends University
{
	String sch;
	
	void gets()
	{
		System.out.println("Enter the name of the School: ");
		sch=sc.nextLine();
	}
}
class Department extends School
{
	String dep;
	
	void getd()
	{
		System.out.println("Enter the name of the Department: ");
		dep=sc.nextLine();
	}
	void print()
	{
		System.out.println("The details are as follows: --------------");
		System.out.println("University: "+uni);
		System.out.println("School: "+sch);
		System.out.println("Department: "+dep);
	}
}
class Multilvl_in
{
	public static void main(String args[])
	{
		Department d=new Department();
		d.get();
		d.gets();
		d.getd();
		d.print();
	}
}