import java.util.*;
class arr
{
	void fun()
	{
		int[] num={1,2,3,4,5};
		System.out.println("Elements in the array are: ");
		for(int i=0;i<num.length;i++)
			System.out.println(num[i]+" ");
		int [] result=rev(num);
		
		System.out.println("\nElements in new array: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(result[i]+" ");
		}
	}
	int[] rev(int[] orgArray)
	{
		int[] temp=new int[orgArray.length];
		int j=0;
		for(int i=orgArray.length-1;i>=0;i--,j++)
			temp[j]=orgArray[i];
		return temp;
	}
}
class Rev_arr
{
	public static void main(String args[])
	{
		arr A=new arr();
		A.fun();
	}
}