 import java.util.Scanner;
 class Occurence{
 	public static void main(String[] args){
    Scanner s=new Scanner(System.in);
		System.out.println("enter the first string");
	    String s1=s.nextLine();
		System.out.println("enter the second string");
        String s2=s.nextLine();
	 if(s1.contains(s2)==true) {
		  System.out.println("String2 contains in String1");
	 }else {
		  System.out.println("String2 doesn't contain in String1");
	 }
}
	}