import java.util.Scanner;
class Array{
	public static void main(String [] args)
	{
		int list[]={1,4,6,7,8,9,10};
		System.out.println("enter any number");
	    Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
		 for(int i=0;i<=list.length;i++){
			 if (n==list[i])
			 { System.out.println(" number is present");
		       break;
				
			 }
		 }
	}
}
