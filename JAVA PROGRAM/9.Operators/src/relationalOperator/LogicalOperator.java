package relationalOperator;

public class LogicalOperator {
	
	public static void main(String args [])
	
	{
		
		//And logical Operator
	System.out.println((10>8)&&(2>5));                       //T && F=F
	System.out.println((10>20)&&(50>20)&&(10>5)&&(100>80));  //F && T && T && T=T
	System.out.println((10<20)&&(50>20)&&(10>5)&&(100>80));  //T && T && T && T=T

	
	  //Or logical Operator
	System.out.println((10>8)||(2>5));                       //T || F= T
	System.out.println((10>20)||(50>20)||(10>5)||(100>80));  //F || T || T || T= T
	System.out.println((10<20)||(50>20)||(10>5)||(100>80));  //T || T || T || T= T
	
	//Not operator
	System.out.println(!true);
	System.out.println(!(78>65));
	
     }
}

       //In "And" operator-If all condition should are true,then result is true.
       //In "Or" operator-If any one condition is true,then result is true.
       //In "Not" operator-exact opposite result we get i.e. reversal.