//String Array
import java.util.Scanner;
public class String_array
{
	public static void main(String args[])
	{
		char[] charArray={'H','i',' ','J','a','v','a'};
		byte[] ascii={65,66,67,68,69,70};
		String str="Welcome";
		String str1=new String("Welcome to Java");
		String str2=new String(charArray);
		String str3=new String(charArray,3,2);
		String str4=new String(ascii);
		String str5=new String(ascii,1,3);
		String str6=new String();
		String str7=new String(str);
		
		System.out.println("str = "+str);
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		System.out.println("str3 = "+str3);
		System.out.println("str4 = "+str4);
		System.out.println("str5 = "+str5);
		System.out.println("str6 = "+str6);
		System.out.println("str7 = "+str7);
		str+=" World";
		System.out.println("str = "+str);
	}
}
