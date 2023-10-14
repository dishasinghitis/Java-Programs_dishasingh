import java.util.*;
class elec
{
	int old_units;
	int new_units;
	int num;
	Scanner s=new Scanner(System.in);
	void get()
	{
		
		System.out.println("Enter the customer number: ");
		num=s.nextInt();
		System.out.println("Enter the old units: ");
		old_units=s.nextInt();
		System.out.println("Enter the new units: ");
		new_units=s.nextInt();
	}
	void get1()
	{
		int opt;
		System.out.println("Enter your choice: ");
		System.out.println("1. Domestic user");
		System.out.println("2. Commercial user");
		opt=s.nextInt();
		if(opt==1)
		{
			cal();
		}
		else
		{
			cal1();
		}
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
	void cal1()
	{
		int units;
		units=new_units-old_units;
		System.out.println("The units payable is: "+units);
		int amt;
		if(units<=1000)
		{
			amt=units*10;
			System.out.println("The bill is: "+amt);
		}
		else if(units>1000&&units<=2000)
		{
			amt=1000*10+(units-1000)*30;
			System.out.println("The bill is: "+amt);
		}
		else if(units>2000)
		{
			amt=1000*10+1000*30+(units-2000)*50;
			System.out.println("The bill is: "+amt);
		}
	}
}
class Elec_bill2
{
	public static void main(String args[])
	{
		elec A=new elec();
		
		int v;
		A.get();
		A.get1();
		A.pri();
	}
}