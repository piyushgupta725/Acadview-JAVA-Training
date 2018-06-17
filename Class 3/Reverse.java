import java.util.Scanner;
class Reverse{
	public static void main(String[] args){ 
	int reverse=0;
    System.out.println("enter any number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n!=0)
	{
		int i=n%10;
		 reverse = (reverse*10)+i;
		 n=n/10;
	}
	System.out.println("the reversed digit is" +reverse );
	
	}
}