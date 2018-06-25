import java.util.*;
public class Sort{
      public static < E > void printArray( E[] inputArray ) {
		  Arrays.sort(inputArray );
            for(E element : inputArray) {
            System.out.println(element);
            }
            System.out.println();
            }
      public static void main(String args[]) {
            Integer[] intArray = {1, 9, 2, 5,8 };
            Double[] doubleArray = { 3.2,9.1, 7.2};
           String[] charArray = {"hlo","yarish","avi"};
            System.out.println(" sorted integer");
            printArray(intArray);   
			System.out.println("sorted double");
            printArray(doubleArray); 
			System.out.println("sorted character");
            printArray(charArray); 
        }
}