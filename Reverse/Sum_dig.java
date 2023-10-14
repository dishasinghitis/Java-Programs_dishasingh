package Reverse;
public class Sum_dig
{
	public int calculate(int y)
	{
		int n=y, d, r=0,sum=0;
		do
		{
			d=n%10;
			sum=sum+d;
			r=r*10+d;
			n=n/10;
			
		}while(n>0);
		
		System.out.println("The sum of digits is: "+sum);
		return sum;
	}
}