package relationalOperator;

public class AssignmentTernaryOperator {
	
	public static void main(String args [])
	{
		
		int a=305;
		int b=49;
		int c=99;
	    int output;
	    
	    output=(a>c)?(a>b?a:b):(b>c?b:c);
	    
	    System.out.println("The greater number is "+output);
	}

}
