package initialisationAndDeclaration;

public class Sample {
	             //declaration
	int a;
	int b;
	
	Sample()     //constructor

	{
	a=10;        //initialization
	b=20;        //initialization
		
	}
	
	public void sub()
	{
		System.out.println(b-a);      //usage    
	}

	public static void main(String args[])
	{
		Sample a = new Sample();
	    a.sub();
		
	}
	
}
