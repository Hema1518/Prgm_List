package relationalOperator;

public class BitwiseOperator {
	
	public static void main(String args[])
	
	{
		   //And Bitwise Operator
		System.out.println((10>8)&(2>5));                       //T && F=F
		System.out.println((10>20)&(50>20)&(10>5)&(100>80));  //F && T && T && T=T
		System.out.println((10<20)&(50>20)&(10>5)&(100>80));  //T && T && T && T=T

		
		  //Or Bitwise Operator
		System.out.println((10>8)|(2>5));                       //T | F= T
		System.out.println((10>20)|(50>20)|(10>5)|(100>80));  //F | T | T | T= T
		System.out.println((10<20)|(50>20)|(10>5)|(100>80));  //T | T | T | T= T
		
		//Xor operator
		System.out.println((10>8)^(20<10));
		System.out.println((10<8)^(20<10));
		System.out.println((10>8)^(20<10));
		System.out.println((10>8)^(20>10)^(50>70)^(100<120));
		
		
		
		
		
		
		
	}

}
