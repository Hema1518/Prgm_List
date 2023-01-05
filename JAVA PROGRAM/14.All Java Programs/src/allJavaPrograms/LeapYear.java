package allJavaPrograms;

import java.util.Scanner;


//....To check year is leap year or not


public class LeapYear {
	
	public static void main(String args [])     //20
	{
		Scanner input = new  Scanner(System.in);
		 int year =input.nextInt();
	    
	    
		
		if((year%4==0 && year%100!=0)||(year%4==0 && year%100==0 ))
		{                                                           //..... year%4 and year%100 --->for century year  
			System.out.println(year +" year is a leap year");       //.....year%4 and year%100!=0--->for non-century year
		}
		else
		{
			System.out.println(year +" year is a not leap year");   
		}
				
	}
	

}
