class Staticblock{
	static{
		System.out.println("static is called");
	}
   Staticblock()
   {
   System.out.println("constructor is called");
}
}
 public class  Mystatic{
	public static void main(String[] args)
	{
		System.out.println("main is called");
		Staticblock s = new Staticblock();
		
	}
}   
	