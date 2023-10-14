import java.util.*;
class elec
{
	int old_units;
	int new_units;
	int num;
	
	int val(int n, int o, int n1)
	{
		num=n;
		old_units=o;
		new_units=n1;
		return num;
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
class Elec_bill
{
	public static void main(String args[])
	{
		elec A=new elec();
		
		int v;
		v=A.val(122,2000,2350);
		A.pri();
		A.cal();
		
	}
}