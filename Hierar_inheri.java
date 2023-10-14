//Hierarchial Inheritance
import java.util.*;
class Get_data
{
	int l=10,b=5,s=20;
	double r=6.00;
	void print()
	{
		System.out.println("The measurements of the Rectangle are: ---------------------------------------------------");
		System.out.println("The length is: "+l);
		System.out.println("The breadth is: "+b);
		System.out.println("The measurement of the Circle is: ---------------------------------------------------");
		System.out.println("The radius of the circle is: "+r);
		System.out.println("The measurement of the Square is: ---------------------------------------------------");
		System.out.println("The side of the square is: "+s);
		
		System.out.println("-----------------------------------------------------------------------------------------");
	}
}
class Area_rect extends Get_data
{
	int area_r=l*b;
	void get_area_rect()
	{
		System.out.println("The area of the rectangle is: "+area_r);
	}
}
class Area_circle extends Get_data
{
	double pie=3.14;
	double area_c=pie*r*r;
	void get_area_circle()
	{
		System.out.println("The area of circle is: "+area_c);
	}
}
class Area_sq extends Get_data
{
	int area_s=s*s;
	void get_area_sq()
	{
		System.out.println("The area of square is: "+area_s);
	}
}
class Hierar_inheri
{
	public static void main(String args[])
	{
		Area_rect A1= new Area_rect();
		A1.print();
		A1.get_area_rect();
	
		Area_circle A2= new Area_circle();
		A2.get_area_circle();
	
		Area_sq A3= new Area_sq();
		A3.get_area_sq();
	}
}