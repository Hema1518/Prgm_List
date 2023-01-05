package scannerClass;

import java.util.Scanner;

public class BasicScanner {
	
	public static void main(String args [])
	{
	
	int a;
	int b;
	
	Scanner input = new Scanner(System.in);
	
	a = input.nextInt();
	b = input.nextInt();
	
	int c =a+b;
	System.out.println("Output is :-" + c);

    }
}
