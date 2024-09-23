import java.util.*;

class Figure {
    private double surfaceArea;

    // Method to calculate surface area of a cube
    public void calculateCubeSurfaceArea(double side) {
      
        surfaceArea = 6 * Math.pow(side, 2);
    }

    // Method to calculate surface area of a cylinder
    public void calculateCylinderSurfaceArea(double radius, double height) {
   
        surfaceArea = 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate surface area of a sphere
    public void calculateSphereSurfaceArea(double radius) {
    
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
    }

    // Method to get the surface area
    public double getSurfaceArea() {
        return surfaceArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figure figure = new Figure();

        // Get input for Cube
        System.out.print("Enter the side length of the cube: ");
        double cubeSide = sc.nextDouble();
        figure.calculateCubeSurfaceArea(cubeSide);
        System.out.println("Surface Area of Cube: " + figure.getSurfaceArea());

        // Get input for Cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double cylinderRadius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double cylinderHeight = sc.nextDouble();
        figure.calculateCylinderSurfaceArea(cylinderRadius, cylinderHeight);
        System.out.println("Surface Area of Cylinder: " + figure.getSurfaceArea());

        // Get input for Sphere
        System.out.print("Enter the radius of the sphere: ");
        double sphereRadius = sc.nextDouble();
        figure.calculateSphereSurfaceArea(sphereRadius);
        System.out.println("Surface Area of Sphere: " + figure.getSurfaceArea());
    }
}
