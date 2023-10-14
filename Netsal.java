import java.util.*;
class emp
{
	double gs,it,pt,pf,netSalary=0;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gross salary: ");
		gs=sc.nextDouble();
		System.out.println("Enter the income tax amount: ");
		it=sc.nextDouble();
		System.out.println("Enter the professional tax amount: ");
		pt=sc.nextDouble();
		System.out.println("Enter the provident fund amount: ");
		pf=sc.nextDouble();
	}
	void print()
	{
		System.out.println("The Gross salary is: "+gs);
		System.out.println("The income tax amount is: "+it);
		System.out.println("The professiional tax amount is: "+pt);
		System.out.println("The provident fund is: "+pf);
	}
	void cal()
	{
		pf=pf*(gs/100);
		it=it*(gs/100);
		pt=pt*(gs/100);
		netSalary=gs-it-pt-pf;
		System.out.println("Net Salary is: "+netSalary);
	}
	void high()
	{
		int a1,a2,a3;
		a1=max(e1[0],e1[1]);
		a2=max(a1,)
	}
}
class Netsal
{
	public static void main(String args[])
	{
		emp e1[]=new emp[3];
		for(int i=0;i<3;i++)
		{
			e1[i]=new emp();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter employee "+(i+1)+": ");
			e1[i].getData();
		}
		for(int i=0;i<3;i++)
		{
			e1[i].print();
		}
		for(int i=0;i<3;i++)
		{
			e1[i].cal();
		}
	}
}
//find the max salary