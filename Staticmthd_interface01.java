interface Bank
{
	void draw();
	static int rateofint(int ri)
	{
		return ri;
	}
}
class Account implements Bank
{
	public void draw()
	{
		System.out.println("The rate of interest is : ");
	}
}
class Staticmthd_interface01
{
	public static void main(String args[])
	{
		Bank b=new Account();
		b.draw();
		System.out.println(Bank.rateofint(7));
	}
}
