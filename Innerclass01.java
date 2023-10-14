public class Innerclass01
{
	private String data="Hello World";//instance variable
	void display()
	{
		class Local//Local inner class
		{
			void msg()
			{
				System.out.println(data);
			}
		}
		Local l=new Local();
		l.msg();
	}
	public static void main(String args[])
	{
		Innerclass01 A=new Innerclass01();
		A.display();
	}
}