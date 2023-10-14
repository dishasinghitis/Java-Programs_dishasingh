import java.util.*;
class elec
{
	int old_units;
	int new_units;
	int num;
	
	void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the customer number: ");
		num=s.nextInt();
		System.out.println("Enter the old units: ");
		old_units=s.nextInt();
		System.out.println("Enter the new units: ");
		new_units=s.nextInt();
	}
	void pri()
	{
		System.out.println("The customer number is: "+num);
		System.out.println("The old units : "+old_units);
		System.out.println("The new units is: "+new_units);
	}
	void cal()
	{
		int units;
		units=new_units-old_units;
		System.out.println("The units payable is: "+units);
		int amt;
		if(units<=100)
		{
			amt=units*2;
			System.out.println("The bill is: "+amt);
		}
		else if(units>100&&units<=200)
		{
			amt=100*2+(units-100)*3;
			System.out.println("The bill is: "+amt);
		}
		else if(units>200)
		{
			amt=100*2+100*3+(units-200)*4;
			System.out.println("The bill is: "+amt);
		}
	}
}
class Elec_bill1
{
	public static void main(String args[])
	{
		elec A=new elec();
		
		int v;
		A.get();
		A.pri();
		A.cal();
		
	}
}