interface Bank
{
	void draw();
	static int cube(int x)
	{
		return x;
	}
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("The rate of interest is : ");
	}
}
class Staticmthd_interface
{
	public static void main(String args[])
	{
		Bank b=new Bank();
		b.draw();
	}
}