// Single Inheritance
import java.util.*;
class Website
{
	String name;
	int port,num_p;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the name of the Website: ");
		name=sc.nextLine();
		
		System.out.println("Enter the port number of the Website Server: ");
		port=sc.nextInt();
		
		System.out.println("Enter the number of Webpages linked to the Website: ");
		num_p=sc.nextInt();
	}
}
class Webpage extends Website
{
	void print()
	{
		System.out.println("The Website data is as follows: ---------------------------");
		System.out.println("Name: "+name);
		System.out.println("Port Number: "+port);
		System.out.println("Number of Webpages linked: "+num_p);
	}
}
class Single_in
{
	public static void main(String args[])
	{
		Webpage w=new Webpage();
		w.get();
		w.print();
	}
}