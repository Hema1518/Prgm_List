package allJavaPrograms;

public class PalindromeString {
	
	public static void main(String args [])
	{
		String a="SAaS";
		
		int l=a.length();
		String rev="";
		
		for(int i=l-1;i>=0;i--)
		{
		  rev=rev+a.charAt(i);
		}
		
		System.out.println("Reverse of a String is " + rev);
				
		if(a.equalsIgnoreCase(rev))
		{
			System.out.println(a + " is  palindrome");
		}
		else
		{
			System.out.println(a + " is not palindrome");

		}
	}
	

}
