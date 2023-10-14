import java.util.*;
class stu1
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
		int max_num;
		for(int i=0;i<3;i++)
		{
			total=total+ca[i];
		}
		if(ca[0]<ca[1]&&ca[0]<ca[2])
		{
			max_num=ca[1]+ca[2];
			System.out.println("The sum of two max marks is: "+max_num);
		}
		else if(ca[1]<ca[0]&&ca[1]<ca[2])
		{
			max_num=ca[0]+ca[2];
			System.out.println("The sum of two max marks is: "+max_num);
		}
		else
		{
			max_num=ca[0]+ca[1];
			System.out.println("The sum of two max marks is: "+max_num);
		}
	}
	void print()
	{
		System.out.println("Name of the student is: "+name);
		System.out.println("Total marks of all the three subjects: "+total);
	}
}
class Student_res
{
	public static void main(String args[])
	{
		stu1 []s=new stu1[5];
		for(int i=0;i<5;i++)
		{
			s[i]=new stu1();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter student "+(i+1)+": ");
			s[i].get();
		}
		for(int i=0;i<5;i++)
		{
			s[i].cal();
		}
		for(int i=0;i<5;i++)
		{
			s[i].print();
		}
	}
}
//take marks of mid term and endterm as well and calculate the percentage according to the weightage