package Array_pack;
public class Search
{
	int[] ar=new int[4];
	public void sea(int[] numarr, int x)
	{
		ar=numarr;
		for(int i=0;i<4;i++)
		{
			if(ar[i]==x)
			{
				System.out.println("The element is present at index "+i);
			}
		}
	}
}