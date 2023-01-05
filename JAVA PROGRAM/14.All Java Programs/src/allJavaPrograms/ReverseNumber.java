package allJavaPrograms;

import java.util.Scanner;

public class ReverseNumber {
		
	// Reverse of a number
		
		public static void main(String args []) 
		{
			Scanner input = new Scanner(System.in);
			
		
	    int num=input.nextInt();
	    int rev=0;
	    
	    
		while(num!=0)
		{
			
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			System.out.println("The reverse of the number is "+rev);
			
		}
		//System.out.println("The reverse of the number is "+rev);	
	}
	}



