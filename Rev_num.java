/*Write a program to print the reverse of a number*/
import java.util.Scanner;
class Rev_num
{
	public static void main(String args[])
	{
		int n, d, r=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=input.nextInt();
		
		while(n>0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		System.out.println("The reverse of the number is: "+r);
	}
}