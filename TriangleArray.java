import java.util.*;

class Triangle {
    int base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }

    void display() {
        System.out.println("Base: " + base + ", Height: " + height + ", Area: " + area());
    }
}

public class TriangleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of triangles: ");
        int n = sc.nextInt();

        Triangle[] triangles = new Triangle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter base and height for triangle " + (i + 1) + ":");
            int base = sc.nextInt();
            int height = sc.nextInt();
            triangles[i] = new Triangle(base, height);
        }

        double maxArea = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (triangles[i].area() > maxArea) {
                maxArea = triangles[i].area();
                maxIndex = i;
            }
        }

        System.out.println("Triangle with highest area:");
        triangles[maxIndex].display();

    }
}
