package allJavaPrograms;

import java.util.Scanner;

public class PalindromeNo {
	
	public static void main(String args [])
	{
		int num;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int n = input.nextInt();
		int rev=0;
		
		num= n;
		while(num!=0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(n==rev)
			System.out.println(n+" is a Palindrome number");
		else
			System.out.println(n+" is not a Palindrome number");
	}
	
}

