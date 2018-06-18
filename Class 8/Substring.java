 import java.util.Scanner;
 class Substring{
  public static void main(String[] args){
	  int s ,length,i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String str = sc.next();
    length = str.length();	
   
	for( i=0;i<length;i++)
	{for( j=1;j<=length-i;j++)
		{ s= str.substringln(i, i+j);
	     System.out.println(s);
	}
  }
 }
 }