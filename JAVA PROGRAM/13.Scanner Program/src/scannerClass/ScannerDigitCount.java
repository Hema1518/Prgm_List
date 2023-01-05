package scannerClass;

import java.util.Scanner;

public class ScannerDigitCount {
	//WAP to count of digit in number.
	
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		
		int a=input.nextInt();
		int num = a;
		int counter;
		
		for(counter=0;num>0;counter++)
		{
			num=num/10;
		}
		
		System.out.println(counter);
		
		
		
	}

}
