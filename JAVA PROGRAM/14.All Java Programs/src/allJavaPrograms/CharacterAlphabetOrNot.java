package allJavaPrograms;

import java.util.Scanner;

public class CharacterAlphabetOrNot {
	
	
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		char i=input.next().charAt(0);
		
		
		if(( i>='A'&&i<='Z')||( i>='a'&&i<='z'))
		   {
			   System.out.println(" Given Character is a Alphabet");  
		   }
		else
		   {
			   System.out.println(" Given Character is not a Alphabet");  
		   }
		
	}

}
