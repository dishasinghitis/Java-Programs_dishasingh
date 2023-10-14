//Multilevel Inheritance
class Books
{
	void fun()
	{
		System.out.println("BOOKS: ---------------");
	}
}
class Thriller extends Books
{
	void fun1()
	{
		System.out.println("Types of Thriller books are: ");
	}
}
class Crime_thriller extends Thriller
{
	void fun2()
	{
		System.out.println("1. Crime Thriller");
	}
}
class Suspense_thriller extends Crime_thriller
{
	void fun3()
	{
		System.out.println("2. Suspense Thriller");
	}
}
class Multilevel_inheri
{
	public static void main(String args[])
	{
		Suspense_thriller A=new Suspense_thriller();
		A.fun();
		A.fun1();
		A.fun2();
		A.fun3();
	}
}