package Reverse;
public class reverse_of_digits
{
	public int cal(int x)
	{
		int n=x, d, r=0;
		while(n>0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}
		System.out.println("The reverse of the number is: "+r);
		return r;
	}
}