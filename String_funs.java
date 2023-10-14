//String functions
import java.util.*;
class Str
{
	String s;
	void get()
	{
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the string: ");
		s=a1.nextLine();
	}
	void fun()
	{
		String s1="Hello World";
		boolean s2=s1.equals(s);
		System.out.println("s is equal to s1? : "+s2);
		
		boolean s3=s1.equalsIgnoreCase(s);
		System.out.println("s is equal to s1?(When we ignore case) : "+s3);
		
		boolean s4=s1.contains("World");
		System.out.println("s contains 'World'? : "+s4);
		
		String s5=s.replace("d","d!!");
		System.out.println("The string s before replace is: "+s);
		System.out.println("The string s after replace is: "+s5);
	}
}
class String_funs
{
	public static void main(String args[])
	{
		Str A=new Str();
		A.get();
		A.fun();
	}
}
