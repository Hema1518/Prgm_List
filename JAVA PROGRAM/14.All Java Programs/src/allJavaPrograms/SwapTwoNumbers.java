package allJavaPrograms;

//import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String args [])
	{
		int a=20;
		int b=60;
		System.out.println("BEFORE SWAP");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		
		int swap=a;
		a=b;
		b=swap;
		
		
		System.out.println("AFTER SWAP");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	}
}