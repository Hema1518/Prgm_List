package loopStatements;

public class ForLoopHorizontalStar 
 {
	//Print * * * * *
	
	public static void main(String args [])
    {
		for(int i=1;i<=5;i++)
		{
			//System.out.print('*');
		}
	
	
	
	// using nested for loop
	
	
	for(int i=1;i<=1;i++)
	  {
		for(int j=1;j<=5;j++)
		{
			System.out.print("*");
	     }
	System.out.print("*");

      }
	
	//sir's method for     * * * * *
	
	for(int i=1;i<=1;i++)
	  {
		for(int j=1;j<=5;j++)
		{
			System.out.print("  *  ");
	     }
	System.out.println();
	  }
	
    }
	
 }