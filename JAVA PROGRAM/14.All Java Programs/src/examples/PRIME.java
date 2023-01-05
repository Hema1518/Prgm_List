package examples;

import java.util.Scanner;

public class New {
	
			//Number is prime or not.
			
			public static void main(String args [])
			{
				Scanner input = new Scanner(System.in);
				 int p = input.nextInt();
				 
				 int a=0;
				 for(int i=2;i<=p-1;i++)
				 {
					 if(p%i==0)
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



