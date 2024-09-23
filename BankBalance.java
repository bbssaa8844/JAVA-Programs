import java.util.*;

// Base class
class BankAccount 
{
    protected double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) 
	{
        if (initialBalance > 0) 
		{
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) 
	{
        if (amount > 0) 
		{
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 
		else 
		{
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) 
	{
        if (amount > 0 && amount <= balance) 
		{
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() 
	{
        System.out.println("Current balance: " + balance);
    }
}

// Subclass of BankAccount
class SavingsAccount extends BankAccount 
{

    // Constructor to initialize SavingsAccount with initial balance
    public SavingsAccount(double initialBalance) 
	{
        super(initialBalance);
    }

    // Overridden withdraw method to prevent withdrawals if balance falls below 100
    public void withdraw(double amount) 
	{
        if (amount > 0) {
            if (balance - amount < 100) 
			
			{
                System.out.println("Withdrawal denied! Account balance cannot fall below 100.");
            } else {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            }
        } 
		else 
		{
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

// Main class to test the program
public class BankBalance 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        // Creating a SavingsAccount object with an initial balance
        System.out.print("Enter initial balance for the savings account: ");
        double initialBalance = sc.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(initialBalance);

        // Display the current balance
        savingsAccount.displayBalance();

        // User input to perform deposit
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        savingsAccount.deposit(depositAmount);
        savingsAccount.displayBalance();

        // User input to perform withdrawal
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        savingsAccount.withdraw(withdrawAmount);
        savingsAccount.displayBalance();
        sc.close();
    }
}
