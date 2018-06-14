import java.util.Scanner;
class Waveform{
	public static void main(String [] args)
	{int n,i,temp;
		Scanner s = new Scanner(System.in);
		System.out.print("enter no elements of array");
		n = s.nextInt();
        int a[] = new int[n];
		System.out.println("enter elements of array");
		for( i=0;i<n;i++)
	{        a[i] = s.nextInt();
	}
for(i=0;i<(a.length-1);i=i+2)
{if(a[i]<a[i+1]){
	temp=a[i];
	a[i]=a[i+1];
  a[i+1]=temp;}
}
for(i=0;i<a.length;i++)
	{
		System.out.print(+a[i]);
	}		
	}
}