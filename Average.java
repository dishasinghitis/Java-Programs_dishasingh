/*Write a program to print the average of n numbers*/
import java.util.Scanner;
public class Average
{
	public static void main(String args[])
	{
		int n,num,sum=0,i;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter n  ");
		n=input.nextInt();
		System.out.println("Enter elements:  ");
		for(i=1;i<=n;i++)
		{
			num=input.nextInt();
			sum+=num;
		}
		double average= (double)sum/n;
		System.out.println("Average of "+n+" numbers= "+average);
	}
}