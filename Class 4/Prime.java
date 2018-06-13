
import java.util.Scanner;
class Prime{
public static void main(String[] args)
{
	System.out.println("enter any number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int i=2;i<=n;i++){
	if(n%i==0){
		System.out.println("prime"+i);
	}
	}
}
}