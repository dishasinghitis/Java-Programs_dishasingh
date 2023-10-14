package Reverse;
public class Sum_dig
{
	public void calculate()
	{
		int n=123, d, r=0;
		while(n>0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		System.out.println("The reverse of the number is: "+r);
		System.out.println(n);
	}
}