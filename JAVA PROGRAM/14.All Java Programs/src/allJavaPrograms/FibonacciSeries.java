package allJavaPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String args [])
	{
		
	   int n=7,a=0,b=0,c=1;
		
		System.out.println("Fibonacci Series:");
		
		for(int i=1;i<=n;i++)
		{
			
			
			a=b;                        //...In this we assign, value of b to a     //  0 1 1 2 3 5  8 
			b=c;                        //...In this we assign, value of c to b     //  1 1 2 3 5 8  13
			c=a+b;                      //....addition takes place                  //  1 2 3 5 8 13 21
			System.out.print(a+ " ");
			
			
			}
		
	}

}
