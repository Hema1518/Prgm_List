package scannerClass;

import java.util.Scanner;

public class ScannerStringNextLine {
	
	public static void main(String args [])
	
	{
		
		Scanner h = new Scanner(System.in);
		
		String a = h.nextLine();          //h=object ref and a=variable and nextline specifies string datatype
		
		System.out.println(a);
		
	}

}





// output is same as given input in  ref.nextLine();

//output is only first word...in....ref.next();