package relationalOperator;

public class AssignmentOperator {
	public static void main(String args[])
	{
		//ASSIGNMENT OPERATOR1		
		int x=30;
		System.out.println(x);	//x=30
		x+=20;
		System.out.println(x);	//x=x+20=30+20=50
		x-=13;
		System.out.println(x);  //x=x-13=50-13=37
		x*=22;
		System.out.println(x);	//x=x*22=37*22=814
		x/=4;
		System.out.println(x);  //x=x/4=814/4=203
		x%=9;
		System.out.println(x);	//x=x%9=203%9=5	
		
		//ASSIGNMENT OPERATOR2
		int y=18;
		y<<=5;                     //y=y*2^5=18*2^5=576
		System.out.println(y);
		y>>=4;                     //y=y/2^4=576/2^4=36
		System.out.println(y);
		
		//ASSIGNMENT OPERATOR
		int z=12;
		System.out.println(z&=4);
		System.out.println(z|=4);
		System.out.println(z^=4);
	}
}