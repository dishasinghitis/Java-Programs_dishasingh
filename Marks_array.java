/*Show the working of an array*/
import java.util.Scanner;
public class Marks_array
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
		
		int avg,sum=0;
		sum=mArray[0]+mArray[1]+mArray[2]+mArray[3]+mArray[4];
		avg=sum/5;
		System.out.println("The sum of Marks is: "+sum);
		System.out.println("The average of Marks is: "+avg);
	}
}