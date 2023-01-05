package scannerClass;

import java.util.Scanner;

public class AssignmentDiv {
	
	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		
		a=input.nextInt();      //Multiplication using Scanner Class
		b=input.nextInt();
		int c=a/b;
		
		System.out.println(c);
		
		
		byte d;
		byte e;
		
		d=input.nextByte();
		e=input.nextByte();    //Modulus using scanner class
		long f=d%e;
		
		System.out.println(f);
	}

}
