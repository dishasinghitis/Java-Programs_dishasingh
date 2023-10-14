import java.util.Scanner;/*Importing the package    java:main package; util:subpackage; scanner:class*/
class SampleOne
{
	public static void main(String args[])	/*Array of object of type string*/
	{
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a=input.nextInt();/*Inbuilt method: nextInt()*/
		System.out.println("Enter the value of b: ");
		b=input.nextInt();
		c=a+b;
		System.out.println("The sum is: "+c);
		
		c=a;
		a=b;
		b=c;
		System.out.println("The value of a after swap is: "+a);
		System.out.println("The value of b after swap is: "+b);
	}
}
/*Java supports unicode character set*/