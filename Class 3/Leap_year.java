class Leap_year {
	public static void main(String [] args){
 int year = 1900;
 if (year%400==0)
	 System.out.println("  leap year"+year);
 
 else if(year%100==0)
	 System.out.println(" not leap year"+year);
	 
	else if(year%4==0)
	 System.out.println(" leap year"+year);
}
}