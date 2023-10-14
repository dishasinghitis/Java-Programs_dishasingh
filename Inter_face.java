interface Drawable //contains abstract classes
{
	void draw();
}
class Rect implements Drawable
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing circle");
	}
}
class Inter_face
{
	public static void main(String args[])
	{
		Drawable d=new Circle();
		d.draw();
		Drawable d1=new Rect();
		d1.draw();
	}
}
