package allJavaPrograms;

import java.util.Scanner;

public class CountOfDigitInANumber {
	
	public static void main(String args [])
	{
		int num=23479,count=0; 
		
		
		while(num!=0)
		{
			num=num/10;
			++count;
			
		}
		
		System.out.println("Count of digit in a given number is "+ count );
	}

}
 