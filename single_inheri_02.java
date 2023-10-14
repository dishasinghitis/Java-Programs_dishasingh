//Single Inheritance
class Base
{
	int a=20;
	void fun()
	{
		System.out.println("Base class----------------------------------------------------------");
		System.out.println("The value of a when accessed through Base class is: "+a);
	}
}
class Derived extends Base
{
	int b=50;
	void fun1()
	{
		System.out.println("Derived class---------------------------------------------------------");
		System.out.println("The value of a when accessed through Derived class is: "+a);
		System.out.println("The value of b accessed through Derived class is: "+b);
	}
}
class Single_inheri
{
	Base a=new Base();
	a.fun();
	
	Derived a1=new Derived();
	a1.fun1();
}