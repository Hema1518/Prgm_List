package relationalOperator;

public class UnaryPostPrefix {
	
	public static void main(String args[]) 
	{
	//Postfix  >>  a++   a--       ------Print + Operation
	//Prefix   <<  ++a   --a       ------Operation + Print
	
	
	int a=10;
	
	System.out.println(a);          //a=10
	System.out.println(a++);        //a=10 >>a=10+1=11
	System.out.println(a++);        //a=11 >>a=11+1=12
	System.out.println(--a);        //a=12-1=11
	System.out.println(--a);        //a=11-1=10
	System.out.println(a);          //a=10
	System.out.println(a--);        //a=10 >>a=10-1=9
	System.out.println(++a);        //a=9 >>a=9+1=10
	System.out.println(++a);        //a=10 >>a=10+1=11
	}

}
