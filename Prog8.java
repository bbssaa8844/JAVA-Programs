import java.util.Scanner;

public class Prog8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the minimum value in the array
        int min = findMinimum(array);

        // Display the minimum value
        System.out.println("The minimum value in the array is: " + min);

        scanner.close();
    }

    // Method to find the minimum value in the array
    public static int findMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}