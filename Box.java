import java.util.*;
class BoxMethod
{
	double height,width,depth;
	void setVolume(double h,double w,double d)
	{
		height=h;
		width=w;
		depth=d;
	}
	double calVolume()
	{
		double volume=height*width*depth;
		return volume;
	}
	void display()
	{
		System.out.println("The Volume of the Box is: "+calVolume());
	}
}
public class Box
{
	public static boolean compareVolume(BoxMethod b1, BoxMethod b2)
	{
		if(b1.calVolume() == b2.calVolume())
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		BoxMethod b1 = new BoxMethod();
		BoxMethod b2 = new BoxMethod();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Height,width and depth of Box1:");
		double h1=sc.nextInt();
		double w1=sc.nextInt();
		double d1=sc.nextInt();
	
		System.out.print("Enter the Height,width and depth of Box2:");
		double h2=sc.nextInt();
		double w2=sc.nextInt();
		double d2=sc.nextInt();
		b1.setVolume(h1,w1,d1);
		b1.calVolume();
		b1.display(); 
		
		b2.setVolume(h2,w2,d2);
		b2.calVolume();
		b2.display();
		if(compareVolume(b1,b2))
		{
			System.out.print("The Volumes of two boxes are Same.");
		}
		else
		{
			System.out.print("The Volumes of two boxes are different.");
		}
	}
}
