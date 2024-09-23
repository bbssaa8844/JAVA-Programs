import java.util.*;

class Complex 
{
    double real, imag;

    Complex(double r, double i) 
    {
        this.real = r;
        this.imag = i;
    }

    Complex add(Complex c) 
    {
        Complex result = new Complex(0, 0);
        result.real = this.real + c.real;
        result.imag = this.imag + c.imag;
        return result;
    }

    Complex subtract(Complex c) 
    {
        Complex result = new Complex(0, 0);
        result.real = this.real - c.real;
        result.imag = this.imag - c.imag;
        return result;
    }

    boolean isEqual(Complex c) 
    {
        return (this.real == c.real && this.imag == c.imag);
    }

    void display() 
    {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexNumbers 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imag1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imag2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        boolean equal = c1.isEqual(c2);

        System.out.println("Sum: ");
        sum.display();
        System.out.println("Difference: ");
        difference.display();
        System.out.println("Equal: " + equal);
        sc.close();
    }
}
