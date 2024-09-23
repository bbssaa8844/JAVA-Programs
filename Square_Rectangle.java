import java.lang.*;

class Square {
    private double side;

    // Parameterized constructor
    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

class Rectangle {
    private double length;
    private double width;

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Square
        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();
        Square square = new Square(side);
        System.out.println("Area of the square: " + square.calculateArea());

        // Input for Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
    }
}
