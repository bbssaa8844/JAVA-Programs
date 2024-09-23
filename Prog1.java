// WAP to Print your Name
import java.util.*;

public class Prog1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.print("Please Enter Your Name: ");
        
        // Read the user's input and store it in a variable
        String name = scanner.nextLine();
        
        // Print the user's name
        System.out.println("My name is: " + name);
        
        // Close the scanner
        scanner.close();
    }
}

