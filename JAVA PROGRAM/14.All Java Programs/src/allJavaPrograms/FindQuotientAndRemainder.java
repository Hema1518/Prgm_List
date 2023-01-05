package allJavaPrograms;

import java.util.Scanner;

public class FindQuotientAndRemainder {
	//Compute Quotient and Remainder of the numbers.
	
   public static void main(String args [])
	{
		Scanner input=new Scanner(System.in);
		
	int a=input.nextInt();
	int b=input.nextInt();
	int div =a/b;
	int mod =a%b;
	
	
	System.out.println("Quotient of two numbers is: " + div);
	System.out.println("Remainder of two numbers is: " + mod);
	
	}

}
