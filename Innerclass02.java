public class Innerclass02
{
	private int a=20;
	private static int b=40;
	class Inner//outer inner class-- the object of the inner class has been created outside the inner class
	{
		public void ml()
		{
			System.out.println("Instance variable: "+a);
			System.out.println("Static variable: "+b);
		}
	}
	public static void main(String args[])
	{
		Innerclass02 o=new Innerclass02();
		Innerclass02.Inner in=o.new Inner();
		in.ml();
	}
}
