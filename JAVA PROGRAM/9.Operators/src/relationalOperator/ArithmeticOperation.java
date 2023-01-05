package relationalOperator;

public class ArithmeticOperation {
	
	public static void main(String args[])
	{
		
		int a=50;
		int b=6;
		float c=5.5f;
		
		System.out.println(a+b);    //56
		System.out.println(a-b);    //44
		System.out.println(a*b);    //300
		
		
		//div and modulus  (/---division,%---modulus)
		System.out.println(a/b);   //8
		System.out.println(a%b);   //2
		System.out.println(b%c);   //0.5
		
		double d= 40;
		int  e= 7;
		
		System.out.println(d/e);
		System.out.println(d%e);
	}

}
