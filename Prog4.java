import java.util.Scanner;

public class Prog4 {
    // Method to calculate the nth Fibonacci number using recursion
    public static int fibonacci(int n) 
    {
        if (n <= 0) 
        {
            return 0;
        }
        if (n <= 1) 
        {
            return 1;
        }
        else
        {
        return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of terms
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        // Calculate and display the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(fibonacci(i) + " ");
        }
    }
}