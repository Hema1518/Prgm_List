package allJavaPrograms;

public class OccuranceOfString {
	
	public static void main(String args [])
	{ 
		String a="Function";
		int l=a.length();
		int count=0;
		char ch='n';
		
		for(int i=0;i<l;i++)
		{
		      
			    if(a.charAt(i)==ch)
			    {
			    	count++;
			    	
			    }
		}
		 
		
		
		System.out.println("Occurences of " +ch+" are "+ count);
		
		
	}

}
