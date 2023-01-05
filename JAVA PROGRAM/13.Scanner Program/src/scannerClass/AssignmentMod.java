package scannerClass;

import java.util.Scanner;

public class AssignmentMod {
	
	public static void main(String args [])
	{
		
		Scanner input = new Scanner(System.in);
	
	byte d;
	byte e;
	
	d=input.nextByte();
	e=input.nextByte();
	long f=d%e;
	
	System.out.println(f);

     }
}
