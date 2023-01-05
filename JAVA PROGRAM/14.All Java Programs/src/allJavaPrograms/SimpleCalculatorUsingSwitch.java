
package allJavaPrograms;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
	
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		char calculator;
		double a,b;
		double result = 0;
		
		 
		 System.out.println("Enter the first number:");
		 a=input.nextDouble();
		 System.out.println("Enter the second number:" );
		 b=input.nextDouble();
		 

		 System.out.println("Enter an operator:");
		 calculator=input.next().charAt(0);
		 
		
		switch(calculator)
		{
			case '+' :
				result = a+b;
			    break;
			case '-' :
				result = a-b;
			    break;
			case '*' :
				result = a*b;
			    break;
			case '/' : 
				result = a/b;
			    break;
			    
			 default :
				 System.out.println("You have entered the wrong operator");
				 return;
		}
			    System.out.println(a+" "+calculator+" "+b+" ="+result);	
		}
	
}
		
		
		
		
		
	
