abstract class Person
{
	abstract void eat();
}
class Innerclass03
{
	public static void main(String args[])
	{
		Person p=new Person()
		{
			void eat()
			{
				System.out.println("Hello this is an anonymous class");
			}
		};
		p.eat();
	}
}