import java.util.*;
class Rect
{
	int length,width,area;
	void setdata(int l,int w)
	{
		length=l;
		width=w;
	}
	void calArea()
	{
		area=length*width;
	}
	void display()
	{
		System.out.println("The Area of the Rectangle is: "+area);
	}
}
public class Rectangle
{
	public static void main(String[] args)
	{
		Rect r1 = new Rect();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Length:");
		int l=sc.nextInt();
		System.out.print("Enter the Width:");
		int w=sc.nextInt();
		r1.setdata(l,w);
		r1.calArea();
		r1.display();
	}
}
