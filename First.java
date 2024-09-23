import java.util.*;
public class First 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:" );
        String name = sc.nextLine(); 
        System.out.println("My name is: " + name);
        System.out.println("Enter Your WBJEE Rank:");
        int rank1 = sc.nextInt();
        System.out.println("My WBJEE Rank is: " + rank1);
        System.out.println("Enter Your JEE MAINS Rank:");
        int rank2 = sc.nextInt();
        System.out.println("My JEEMAINS Rank is: " + rank2);
        sc.close();
    }
}
