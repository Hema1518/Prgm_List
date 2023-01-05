package decisionMakingStatements;

public class Assignment3 {

	//Check whether a character is alphabet or not.
	
	public static void main(String args[])
	{
		char alpha='"';         //For both lower and upper case,condition should be different.
		
		if((alpha>='A'&&alpha<='Z')||(alpha>='a'&&alpha<='z'))    
		{
			System.out.println("The character is Alphabet.");
		}
		
		else
		{
			System.out.println("The character is not Alphabet.");
		}
		
	}
}