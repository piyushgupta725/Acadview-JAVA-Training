import java.util.Scanner;

class String_Demo{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		
		System.out.println("enter the string");
		String s1 = n.nextLine();
		
		System.out.println("enter the string");
		String s2 = n.nextLine();
		
		int result1 = Integer.parseInt(s1);
		int result2 = Integer.parseInt(s2);
		
		if (result1>result2)
		{
		System.out.println(result1);
		}
		else
		{
			System.out.println(result2);
		}
		
	}
}