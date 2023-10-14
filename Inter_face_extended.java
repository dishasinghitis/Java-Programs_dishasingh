interface print_hello
{
	void print();
}
interface print_welcome extends print_hello
{
	void show();
}
class Inter_face_extended
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
	public static void main(String args[])
	{
		Inter_face_extended A= new Inter_face_extended();
		A.print();
		A.show();
	}
}
