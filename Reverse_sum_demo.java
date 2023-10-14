import java.util.*;
import Reverse.*;
class Reverse_sum_demo
{
	public static void main(String args[])
	{
		reverse_of_digits r=new reverse_of_digits();
		Sum_dig nr=new Sum_dig();
		int a, num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		System.out.println("Enter your choice: ");
		System.out.println("1. Reverse of the number");
		System.out.println("2. Sum of the digits");
		a=sc.nextInt();
		if(a==1)
		{
			r.cal(num);
		}
		else if(a==2)
		{
			nr.calculate(num);
		}
		else
		{
			System.out.println("Invalid Input!!");
		}
	}
}