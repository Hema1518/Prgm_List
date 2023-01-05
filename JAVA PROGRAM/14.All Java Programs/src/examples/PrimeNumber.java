package examples;

public class PrimeNumber {
	//Number is prime or not.
	
	public static void main(String args [])
	{
		int num=9;
		for(int i=2;i<=num/2;i++)
		{
		
			if(num%i==0) 
			{
				System.out.println(num + " is a non-prime number");
			}
				
			else 
				System.out.println(num + " is a prime number");
				break;
			}
		
	  }
	
}