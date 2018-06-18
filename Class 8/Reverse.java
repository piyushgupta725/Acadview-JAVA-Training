 import java.util.Scanner;
 class Reverse{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string");
	String str = sc.next(); 
	char[] arr = str.toCharArray();
	System.out.println("the original string ");
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	
	}
	System.out.println("the reversed string ");
	for(int j=arr.length-1;j>=0;j--){
	System.out.println(arr[j]);
	}

}
}