import java.util.*;
class m
{
	int num;
	float num1;
	
	int int_input(int n)
	{
		num=n;
		return num;
	}
	float float_input(float f)
	{
		num1=f;
		return num1;
	}
	void display()
	{
		System.out.println("The integer value is: "+num);
		System.out.println("The float value is: "+num1);
	}
}
class Method
{
	public static void main(String args[])
	{
		m m1=new m();
		int opt;
		do
		{
			System.out.println("Enter your choice: ");
			System.out.println("1. Integer Input");
			System.out.println("2. Float Input");
			System.out.println("3. Display the values");
			System.out.println("4. Exit");
			Scanner input=new Scanner(System.in);
			opt=input.nextInt();
			
			if(opt==1)
			{
				int s;
				s=m1.int_input(10);
				System.out.println("The entered integer value is: "+s);
			}
			else if(opt==2)
			{
				float s1;
				s1=m1.float_input(10.45f);
				System.out.println("The entered float value is: "+s1);
			}
			else if(opt==3)
			{
				m1.display();
			}
		}while(opt!=4);
	}
}