import java.util.*;
class Compare{
	public static void main(String[] args)
	{
		HashSet<String> h1 = new HashSet<String>();
		h1.add("rahul");
		h1.add("satyam");
		h1.add("avnish");
		h1.add("sajan");
		System.out.println(h1);
		
		HashSet<String> h2 = new HashSet<String>();
		h2.add("rahul");
		h2.add("mukesh");
		h2.add("sham");
		h2.add("Ram");
		System.out.println(h2);
		 h1.retainAll(h2);
        System.out.println("Retained elements");
        System.out.println(h1);
}
}