import java.util.*;
class Employee
{
	String name;
	int empid,dep;
	int sal,comm;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		
		System.out.println("Enter the name of employee: ");
		name=sc.nextLine();
		
		System.out.println("Enter the Employee ID: ");
		empid=sc.nextInt();
		
		System.out.println("Enter the department name: ");
		System.out.println("1. Worker");
		System.out.println("2. Manager");
		System.out.println("3. Clerk");
		dep=sc.nextInt();
	}
}
class Worker extends Employee
{
	void p1()
	{
		if(dep==1)
		{
			System.out.println("Enter the salary: ");
			sal=sc.nextInt();
			System.out.println("Enter the Commission: ");
			comm=sc.nextInt();
			
			System.out.println("The Employee data is as follows: ");
			System.out.println("ID: "+empid);
			System.out.println("Name: "+name);
			System.out.println("Department number: "+dep);
			System.out.println("Salary: "+sal);
			System.out.println("Commission: "+comm);
		}
	}
}
class Manager extends Employee
{
	void p2()
	{
		if(dep==2)
		{
			System.out.println("Enter the salary: ");
			sal=sc.nextInt();
			System.out.println("Enter the Commission: ");
			comm=sc.nextInt();
			
			System.out.println("The Employee data is as follows: ");
			System.out.println("ID: "+empid);
			System.out.println("Name: "+name);
			System.out.println("Departmentnumber: "+dep);
			System.out.println("Salary: "+sal);
			System.out.println("Commission: "+comm);
		}
	}
}
class Clerk extends Employee
{
	void p3()
	{
		if(dep==1)
		{
			System.out.println("Enter the salary: ");
			sal=sc.nextInt();
			System.out.println("Enter the Commission: ");
			comm=sc.nextInt();
			
			System.out.println("The Employee data is as follows: ");
			System.out.println("ID: "+empid);
			System.out.println("Name: "+name);
			System.out.println("Department number: "+dep);
			System.out.println("Salary: "+sal);
			System.out.println("Commission: "+comm);
		}
	}
}
class hierarchial_inheri
{
	public static void main(String args[])
	{
		Worker w=new Worker();
		w.get();
		w.p1();
		
		Manager m=new Manager();
		m.p2();
		
		Clerk c=new Clerk();
		c.p3();
	}
}