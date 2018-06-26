import java.util.*;  
import java.io.*; 
class A extends Thread{
     int i=1;
	 public synchronized void run() {
	  while(i<=500) {
		 System.out.println(i);
		 i++;
	 }
	}
  }
class B extends Thread {
	int i=501;
	public  synchronized void run() {
	while(i<=1000) {
			System.out.println(i);
			i++;
		}
      }
     }
class Print{
	 public static void main(String[] args) throws InterruptedException {
	  A a  = new A();
      B b  = new B();
	   a.start();
	   a.join();
	   b.start();
	   }
	  }