package allJavaPrograms;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String args [])
		{
			
		int p=7;
			 
			 int a=0;
			 for(int i=2;i<=p-1;i++)      //....To check num between (2,3,4,5,6) 
			 {
				 if(p%i==0)              //....condition to check the number is prime or not
					                     //....it will check (p%i==0)condition only for number between (2,3,4,5,6).
					                     //....if condition seems right then only it will get into block otherwise check for next number.
				 {
					a=a+1; 
				 }
			 }
			     if(a>0)
			       {
				     System.out.println("Number is not prime");
			       }
			     else
			     {
				     System.out.println("Number is prime");
			      }
			     
			     
			 }
			 
 
	}
