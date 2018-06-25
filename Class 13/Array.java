import java.util.*;
public class Array{
      public static < E > void printArray( E[] inputArray ) {
            for(E element : inputArray) {
            System.out.print(element);
            }
            System.out.println();
            }
      public static void main(String args[]) {
            Integer[] intArray = { 9, 2, 5 };
            Double[] doubleArray = { 9.1, 7.2};
            Character[] charArray = {'H','Y'};
            System.out.println("integer");
            printArray(intArray);   
			System.out.println("double");
            printArray(doubleArray); 
			System.out.println("character");
            printArray(charArray); 
        }
}