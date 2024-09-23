import java.util.*;
import java.util.Stack;

public class StackOperations 
{

    public static void main(String[] args) 
	{
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) 
		{
            System.out.println("\nChoose an operation:");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Exit");
            int choice = scanner.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.println("Enter a number to push:");
                    int number = scanner.nextInt();
                    stack.push(number);
                    System.out.println(number + " pushed to stack.");
                    break;
                case 2:
                    if (stack.isEmpty()) 
					{
                        System.out.println("Stack is empty. Cannot pop.");
                    } else 
					{
                        int poppedNumber = stack.pop();
                        System.out.println(poppedNumber + " popped from stack.");
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Current Stack: " + stack);
        }
	}
}
