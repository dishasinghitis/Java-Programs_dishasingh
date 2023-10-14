//Write a program to Create employee class to print only those whose salary is same using the concept of passing array as function argumnents
import java.util.*;
class Employee //declaring the first class
{
	int [] sal={2000,3000,2000}; //declaring the array
	void fun() //declaring the first function
	{
		System.out.println("The salaries are: ");
		for(int i=0;i<3;i++)		//loop to print the elements of the array: sal
		{
			System.out.println(i+" "+sal[i]+" ");
		}
	}
	void fun1(int[] arr)		//declaring the function with an array as an argument
	{							//applying conditions to print the same salaries
		if(sal[0]==sal[1])
		{
			System.out.println("The same salaries are: ");
			System.out.println(sal[0]);
			System.out.println(sal[1]);
		}
		else if(sal[0]==sal[2])
		{
			System.out.println("The same salaries are: ");
			System.out.println(sal[0]);
			System.out.println(sal[2]);
		}
		else if(sal[1]==sal[2])
		{
			System.out.println("The same salaries are: ");
			System.out.println(sal[1]);
			System.out.println(sal[2]);
		}
	}
}
class Ca1_emp				//declaring the second class
{
	public static void main(String args[])		//declaring the main function
	{
		Employee E=new Employee();		//making an object of the Employee class
		int[] ar=E.sal;				//Assigning sal(array) to ar(array) of class Employee
		E.fun();					//calling the first function with the object Employee class
		E.fun1(ar);					//calling the second function of Employee class with the array- ar as an argument
	}
}