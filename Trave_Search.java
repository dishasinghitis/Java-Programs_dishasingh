import Array_pack.*;
import java.util.*;
class Trave_Search
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int[] in_ar=new int[4];
	System.out.println("Enter the array: ");
	for(int i=0;i<4;i++)
	{
		in_ar[i]=sc.nextInt();
	}
	System.out.println("Enter the number you want to search from the array: ");
	int num;
	num=sc.nextInt();
	
	Traverse t=new Traverse();
	t.tra(in_ar);
	
	Search s=new Search();
	s.sea(in_ar,num);
	}
}