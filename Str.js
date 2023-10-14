import java.util.*;
public class str
{
	public static void main(String args[])
	{
		char[] charArray={'H','i',' ','J','a','v','a'};
		byte[] ascii={65,66,67,68,69,70};
		String str="Welcome";
		String str1=new String("Welcome to Java");
		String str2=new String(charArray);
		String str6=new String();
		String str7=new String(str);
		
		System.out.println("str = "+str);
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		System.out.println("str6 = "+str6);
		System.out.println("str7 = "+str7);
		str+=" World";
		System.out.println("str = "+str);
	}
}