//Innerclass
import java.util.*;
class Employee_Inner_cal_bonus
{
	int sal;
	Scanner sc=new Scanner(System.in);
	void fun_outer()
	{
		System.out.println("Enter the Salary: ");
		sal=sc.nextInt();
		System.out.println("The salary of the Employee is: "+sal);
	}
	class Bonus
	{
		int b;
		void fun_inner()
		{
			b=(sal*5)/100;
			System.out.println("The bonus is: "+b);
		}
	}
	public static void main(String args[])
	{
		Employee_Inner_cal_bonus a=new Employee_Inner_cal_bonus();
		a.fun_outer();
		
		Employee_Inner_cal_bonus.Bonus b1=a.new Bonus();
		b1.fun_inner();
	}
}