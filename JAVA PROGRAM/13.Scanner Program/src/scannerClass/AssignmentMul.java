package scannerClass;

import java.util.Scanner;

public class AssignmentMul {
	
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		
		long a;
		long b;
		
		a=input.nextLong();
		b=input.nextLong();
		long c=a*b;
		
		System.out.println(c);
	}

}
