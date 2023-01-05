package allJavaPrograms;

public class LCMOfNumbers {

		public static void main(String args [])
		{
			int num1=9;
			int num2=81;
			int gcd=1;
			
			int min=(num1>num2)?num1:num2;
			
			for(int i=1;i<=min;i++)
			{
				if(num1%i==0 && num2%i==0)
				{
					gcd=i;
				}
				
			}
			
				System.out.println("GCD of "+num1 +" and "+ num2 +" is "+gcd );
				
				
				
				int lcm=(num1*num2)/gcd;
				System.out.println("LCM of "+num1 +" and "+ num2 +" is "+lcm);
				
		}
		
	}



