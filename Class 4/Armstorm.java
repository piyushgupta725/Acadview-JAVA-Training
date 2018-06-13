import java.util.Scanner;
class Armstorm{
	public static void main(String [] args)
	{
		System.out.println("enter any number");
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	int num= s;
	int sum=0;
	for(int i=num;i!=0;i=i/10)
	{
		int q = i%10;
		sum=sum+(q*q*q);
	}
	if (sum==s)
	{
	System.out.println("number is armstorm");
	}
else{
	System.out.println("not Armstorm");
	}


}
}