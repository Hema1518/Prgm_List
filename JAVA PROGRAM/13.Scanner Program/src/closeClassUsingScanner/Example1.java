package closeClassUsingScanner;

//............close() is used to close scanner object(i.e.)to prevent from dead code

import java.util.Scanner;

public class Example1 {
	
	public static void main(String args [])
	{
		Scanner input= new Scanner(System.in);
		String text=input.next();
		
		
		System.out.println("The provided text is ......"+text);
		
		input.close();
		
	}

}
