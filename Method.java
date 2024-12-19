package selenium;
import java.util.Scanner;
public class Method {
 
	 static void b() {
		System.out.println(" method in B");
	}
	  int c(int a, int b) {
		int d =  (a+b);
		System.out.println("int method c ");
		System.out.println("add two interger " +  d);
		return d;
	
	  }
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a= scr.nextInt();
		int sum=0;
		for(int i =0;i<a;i++) {
			System.out.println(i);
		}
		
		Method mb = new Method();
	         mb.c(45,55);
	                b();
	                car obj = new car();
	                obj.run();
	           int   f  =  obj.wheel(4);
	           System.out.println("my car run with wheel " + f);	
	}
public static class car extends motor{

	@Override
	void run() {
	System.out.println("my car run with petrol");		
	}
	
	int wheel(int a) {
	return a;
	}
}
}
 abstract class motor{
	 //int wheel;
	abstract  void run() ;
	
	
 }

 