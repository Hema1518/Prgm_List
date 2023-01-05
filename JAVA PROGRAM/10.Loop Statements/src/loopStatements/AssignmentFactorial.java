package loopStatements;

public class AssignmentFactorial {
	//Factorial of numbers 
	
	public static void main(String args [])
	{
		
		int a=40;
		double fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			System.out.println("Factorial of  " + i + "  is  " +fact);
		}
		
	}
	

}
