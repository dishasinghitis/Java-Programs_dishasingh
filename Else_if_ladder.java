import java.util.Scanner;
class Else_if_ladder
{
	public static void main(String args[])
	{
		int a,b,n,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a=input.nextInt();
		System.out.println("Enter the second number: ");
		b=input.nextInt();
		do
		{
			System.out.println("Enter your choice-- ");
			System.out.println("1. Add the two numbers.");
			System.out.println("2. Subtract the two numbers.");
			System.out.println("3. Exit.");
			n=input.nextInt();
				if(n==1)
				{
					c=a+b;
					System.out.println("The sum of two numbers is: "+c);
				}
				else if(n==2)
				{
					c=a-b;
					System.out.println("The difference of two numbers is: "+c);
				}
				else
				{
					System.out.println("Bye!");
				}
		}while(n!=4);
	}
}