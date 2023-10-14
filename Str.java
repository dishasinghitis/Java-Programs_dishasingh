import java.util.*;
public class Str
{
	public static void main(String args[])
	{
		char[] charArray={'H','i',' ','J','a','v','a'};
		byte[] ascii={65,66,67,68,69,70};
		String str="Welcome";
		String str1=new String("      Welcome to Java");
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
		
		String itemarr[]=new String[3];
		str2=str1.toLowerCase();
		System.out.println("str2 = "+str2);
		str2=str1.toUpperCase();
		System.out.println("str2 = "+str2);
		str2=str1.replace("Welcome to","This Is");//no permanent chnages are being made--- only one time changes
		System.out.println(str2);
		str2=str1.trim();
		System.out.println(str2);
	}
}
//string is immutable(in terms of length) while stringbuffer is mutable in terms of both length and content.
//string and string buffer methods---wap