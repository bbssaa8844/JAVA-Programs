import java.util.*;
class PersonMethod
{
	String  name;
	int age;
	void setData(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}
public class Person
{
	public static boolean compareAge(PersonMethod p1, PersonMethod p2)
	{
		if(p1.age > p2.age)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		PersonMethod p1 = new PersonMethod();
		PersonMethod p2 = new PersonMethod();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name and age of Person1:");
		String name1 = sc.nextLine();
		int age1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Enter the name and age of Person2:");
		String name2 = sc.nextLine();
		int age2 = sc.nextInt();
		
		p1.setData(name1,age1);
		p2.setData(name2,age2);
		

		if(compareAge(p1,p2))
		{
			System.out.println("The person1 named "+name1+" is senior aged"+age1);
		}
		else
		{
			System.out.println("The person2 named "+name2+" is senior aged"+age2);
		}
	}
}
