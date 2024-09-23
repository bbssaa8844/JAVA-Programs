import java.util.*;

public class Prog10 {
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

        // Prompt user to enter the target value to search
        System.out.print("Enter the target value to search: ");
        int target = scanner.nextInt();

        // Perform linear search
        int result = linearSearch(array, target);

        // Display the result
        if (result == -1) {
            System.out.println("Target value not found in the array.");
        } else {
            System.out.println("Target value found at index: " + result);
        }

        scanner.close();
    }

    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index of the target value
            }
        }
        return -1; // Return -1 if target value is not found
    }
}
