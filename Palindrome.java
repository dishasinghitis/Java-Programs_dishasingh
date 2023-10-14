import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		int n, d, r=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=input.nextInt();
		int num=n;/*Temporary variable*/
		while(n>0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		System.out.println("The reverse of the number is: "+r);
		
		if(r==num)
		{
			System.out.println("The number is a palindrome.");
		}
		else
		{
			System.out.println("The number is not a palindrome.");
		}
	}
}