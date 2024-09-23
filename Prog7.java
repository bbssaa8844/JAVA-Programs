import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt user to enter an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform the operation based on the operator using switch case
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        scanner.close();
    }
}