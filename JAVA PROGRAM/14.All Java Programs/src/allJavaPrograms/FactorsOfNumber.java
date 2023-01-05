package allJavaPrograms;

public class FactorsOfNumber {
	
	public static void main(String args [])
	{
		int a =27;
		
		System.out.print("The factors of "+a+" are: ");
		for(int i=1;i<=a;i++) 
		{
			if(a%i==0)
			{
				System.out.print(i + "  ");
			}
			
		}
		
		
	}


}
