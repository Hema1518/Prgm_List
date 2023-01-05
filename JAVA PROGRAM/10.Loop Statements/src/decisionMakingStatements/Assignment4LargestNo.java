package decisionMakingStatements;

public class Assignment4LargestNo {
	
	public static void main(String args[])
	{
		int p=31;
		int q=50;
		int r=290;
		int s=19;
		
		if((p>q)&&(p>r)&&(p>s))
		{
			{
					System.out.println("p is greater than q,r,s");
			}
		}
		else
		{
		   if((q>r)&&(q>s)&&(q>p))
		       {
				   System.out.println("q is greater than r,s,p");  
			   }
			   else
			   {
				   if(r>p&&r>q&&r>s)
				   {
					   System.out.println("r is greater than p,q,s");
					   
				   }
				   else 
				   {
					   System.out.println("r is lesser than p,q,s");
				   }
			   }
		   }
		   
			
		}
	}
