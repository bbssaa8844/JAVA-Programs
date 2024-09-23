import java.util.*;

class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }
}

class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        Square square = new Square(side);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);

        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

    }
}
