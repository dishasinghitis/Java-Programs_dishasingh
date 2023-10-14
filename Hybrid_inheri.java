//Hierarchial Inheritance
import java.util.*;
class Books
{
	void fun()
	{
		System.out.println("Different Genre of Books: ---------------------");
	}
}
class Fiction extends Books
{
	void print_f()
	{
		System.out.println("Genre of book: FICTION");
	}
}
class Crime_thriller extends Books
{
	void print_th()
	{
		System.out.println("Genre of book: CRIME THRILLER");
	}
}
class Arthur_conan_doyle extends Crime_thriller
{	
	void print_name1()
	{
		System.out.println("Crime Thriller Writer 1: Sir Arthur Conan Doyle");
	}
}
class Agatha_christie extends Crime_thriller
{	
	void print_name2()
	{
		System.out.println("Crime Thriller Writer 2: Agatha Christie");
	}
}
class Hybrid_inheri
{
	public static void main(String args[])
	{
		Fiction F=new Fiction();
		F.fun();
		F.print_f();
		
		Crime_thriller C=new Crime_thriller();
		C.fun();
		
		Arthur_conan_doyle A1=new Arthur_conan_doyle();
		A1.print_th();
		A1.print_name1();
		
		Agatha_christie A2=new Agatha_christie();
		A2.print_th();
		A2.print_name2();
	}
}
