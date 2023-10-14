// Hierarchial Inheritance
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
	Worker()
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
	Manager()
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
	Clerk()
	{
		if(dep==3)
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
class Hierar_in
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.get();
		Worker w=new Worker();
		Manager m=new Manager();
		Clerk c=new Clerk();
		
	}
}