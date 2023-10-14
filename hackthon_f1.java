import java.util.*;
class Books
{
	int a;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Choose your favorite Genre of Books: ");
		System.out.println("1. Crime Thriller");
		System.out.println("2. Historical");
		System.out.println("3. Comedy");
		System.out.println("4. Romance");
		System.out.println("5. Science Fiction");
		System.out.println("6. Romantic Comedy");
		System.out.println("7. Suspense Thriller");
		a=sc.nextInt();
	}
	void choose()
	{
		switch(a)
		{
			case 1:
				ct();
				break;
			case 2:
				h();
				break;
			case 3:
				com();
				break;
			case 4:
				r();
				break;
			case 5:
				scifi();
				break;
			case 6:
				romcom();
				break;
			case 7:
				sus();
				break;
			default: 
				System.out.println("Invalid Input!!");
		}
	}
	void ct()
	{
		System.out.println("The Crime Thriller Book section: --------------------");
		System.out.println("Choose your favorite writer: ")
		ct_sub();
	}
	void st_sub()
	{
		
	}
	void h()
	{
		System.out.println("The Historical books section: -----------------------");
	}
	void com()
	{
		System.out.println("The Comedy books section: ---------------------");
	}
	void r()
	{
		System.out.println("The Romance books section: ------------------");
	}
	void scifi()
	{
		System.out.println("The Science Fiction books section: ------------------");
	}
	void romcom()
	{
		System.out.println("The Romantic Comedy books section: -------------------");
	}
	void sus()
	{
		System.out.println("The Suspense Thriller books section: ----------------------");
	}
}
public class hackthon_f1
{
    public static void main(String args[])
	{
		Books b=new Books();
		b.get();
		b.choose();
	}
}