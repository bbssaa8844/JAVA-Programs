// Write a java program to calculate sum and average of two numbers by user input

import java.util.*;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;

        // Calculate the average
        double average = sum / 2;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}