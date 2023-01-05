package methodCalling;

public class ClassB {    //method calling within class with argument
	
	public void add(int a,int b)   //int a=20
	{
		System.out.println(a+b);
		
	}
	
	
	public static void sub(int a,int b)
	{ 
		System.out.println(a-b);
		
		
	}
	public static void main(String args[])
	{
		ClassB.sub(50,10);
		ClassB d=new ClassB();
		d.add(10,20);
		
		
	}

}
