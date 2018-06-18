 import java.util.Scanner;
 class Word{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String str = sc.nextLine();
    int count=1;
    int i;	
	for (i=0;i<str.length()-1;i++)
	{
		if (str.charAt(i)== ' ')
		{
			 count++;
		}
		}

	System.out.println(count);
  }
 }
 