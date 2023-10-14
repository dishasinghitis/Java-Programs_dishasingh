import java.util.Scanner;
class Voting
{
	public static void main(String args[])
	{
		int a,b,n,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Year of Birth: ");
		a=input.nextInt();
		System.out.println("Enter the Current Year: ");
		b=input.nextInt();
		
		int age;
		age=b-a;
		System.out.println("Your age is: "+age);
		if(age>=18)
		{
			System.out.println("You are Eligible for Voting!");
		}
		else
		{
			System.out.println("You are not Eligible for Voting!");
		}
	}
}