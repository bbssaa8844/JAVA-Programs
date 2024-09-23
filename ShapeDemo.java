import java.util.*;

class Shape 
{
    double perimeter;
    double area;

    public double getPerimeter() 
	{
        return perimeter;
    }

    public double getArea() 
	{
        return area;
    }
}

class Circle extends Shape 
{
    private double radius;

    public Circle(double radius) 
	{
        this.radius = radius;
    }

    public double getPerimeter() 
	{
        return 2 * Math.PI * radius;
    }

    public double getArea() 
	{
        return Math.PI * radius * radius;
    }
}

public class ShapeDemo 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Perimeter of the circle: " + circle.getPerimeter());
        System.out.println("Area of the circle: " + circle.getArea());
        sc.close();
    }
}