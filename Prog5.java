import java.util.Scanner;

public class Prog5  
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the first matrix
        System.out.print("Enter the number of rows of the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int cols1 = scanner.nextInt();

        // Input dimensions of the second matrix
        System.out.print("Enter the number of rows of the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int cols2 = scanner.nextInt();

        // Check if multiplication is possible
        if (cols1 != rows2) 
        {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        // Initialize matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        // Input elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) 
        {
            for (int j = 0; j < cols1; j++) 
            {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) 
        {
            for (int j = 0; j < cols2; j++) 
            {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Initialize the result matrix
        int[][] result = new int[rows1][cols2];

        // Perform the multiplication
        for (int i = 0; i < rows1; i++) 
        {
            for (int j = 0; j < cols2; j++) 
            {
                for (int k = 0; k < cols1; k++) 
                {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows1; i++) 
        {
            for (int j = 0; j < cols2; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
