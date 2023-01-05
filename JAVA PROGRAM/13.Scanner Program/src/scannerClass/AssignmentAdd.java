package scannerClass;

import java.util.Scanner;

public class AssignmentAdd {
	
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		
		a=input.nextInt();
		b=input.nextInt();
		int c=a+b;
		
		System.out.println(c);
	}

}
