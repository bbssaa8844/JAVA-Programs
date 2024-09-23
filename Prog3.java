import java.util.*;
public class Prog3
{
    public static int factorial(int number)
    {
        if(number==0 || number==1)
        {
            return 1;
        }
        else
        {
            return number*factorial(number-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        int result=factorial(a);
        System.out.println("Factorial is: " + result);
        sc.close();
    }
}