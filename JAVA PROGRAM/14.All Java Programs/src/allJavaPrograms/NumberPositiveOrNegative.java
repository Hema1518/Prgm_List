package allJavaPrograms;

import java.util.Scanner;

public class NumberPositiveOrNegative {
	
	
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		
		int i =input.nextInt();
		
		if(i<0)
		{
			System.out.println(" given number is a Negative Number");
		}
		else if(i>0)
		{
			System.out.println(" given number is a Positive Number");
		}
		else 
		{
			System.out.println(" given number is Zero");
		}
	}

}
