/*Show the working of an array*/
import java.util.Scanner;
public class Array_marks
{
	public static void main(String args[])
	{
		int[] mArray=new int[5];
		int i;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your marks: ");
		for(i=0;i<5;i++)
			mArray[i]=input.nextInt();
			for(i=0;i<mArray.length;i++)
				System.out.println("Subject ["+i+"] ="+mArray[i]);
		
		
	}
}