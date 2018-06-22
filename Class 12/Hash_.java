
import java.util.*;class Hash_{
	public static void main(String[] args){
	 HashMap<String,Integer> h1= new HashMap<String,Integer>();
	        h1.put("rahul", 91);
            h1.put("avnish",73);
            h1.put("satyam",82);
            h1.put("sajan",76);
            h1.put("piyush",58);
			Set S1 = h1.entrySet();
			Iterator I1 = S1.iterator();
			while(I1.hasNext()){
                Map.Entry M1=(Map.Entry)I1.next();
                System.out.print(M1.getKey()+":");
			    System.out.println(M1.getValue());
			}
		
}
}