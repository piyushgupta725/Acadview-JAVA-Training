class Palidrome {
	public static void main(String[] args)
	{ 
	int original=564;
	
	int a=original%10;
	original=original/10;
	int b=original%10;
	original=original/10;
	int c=original%10;
	int reverse=(a*100)+(b*10)+c;
	
	System.out.println("the reversed digit is"+reverse );
	
	if(reverse==original)
	{
	System.out.println("palidrome");

	}
	else
	{
		System.out.println("not palidrome");
	}

}
}