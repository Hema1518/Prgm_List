package allJavaPrograms;

public class ReverseString 
{
	
	//Easy way of reverse method
				
	public static void main(String args [])
		{
					String a ="String Programs";
					int l=a.length();
					String rev=" ";
					//System.out.println(movie);
					
			for(int i=l-1;i>=0;i--)
			  {
				rev=rev+a.charAt(i);
				
			  }
			System.out.println(rev);
					
		}
	
}
		



