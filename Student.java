import java.util.*;
class stu
{
	Scanner sc=new Scanner(System.in);
	String name;
	int total=0;
	int ca[]=new int[3];
	void get()
	{
		System.out.println("Enter the name of the student: ");
		name=sc.nextLine();
		System.out.println("Enter the marks of all the subjects: ");
		for(int i=0;i<3;i++)
		{
			ca[i]=sc.nextInt();
		}	
	}
	void cal()
	{
		for(int i=0;i<3;i++)
		{
			total=total+ca[i];
		}
	}
	void print()
	{
		System.out.println("Name of the student is: "+name);
		System.out.println("Total marks of the student: "+total);
	}
}
class Student
{
	public static void main(String args[])
	{
		stu ob1=new stu();
		ob1.get();
		ob1.cal();
		ob1.print();
		stu ob2=new stu();
		ob2.get();
		ob2.cal();
		ob2.print();
	}
}