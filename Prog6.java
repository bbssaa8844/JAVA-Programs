import java.util.*;

public class Prog6
{
    public static int prime(int n)
    {
        if(n==1)
        {
            return 0;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound of the range: ");
        int upper = sc.nextInt();
        System.out.println("Prime numbers between " + lower + " and " + upper + ":");
        for (int i = lower; i <= upper; i++) 
        {
            if (prime(i) != 0) 
            {
                System.out.print(i+ " ");
            }
        }
    }
}