package constructorTypes;

public class ArgumentConstructor {
	ArgumentConstructor (int a,int b,int c)
	
	{
		System.out.println(a+b+c);
	}
	
	ArgumentConstructor (int x,float z)
	{
		System.out.println(x+z);
	}

	public static void main(String args[])
	{
		new ArgumentConstructor (10,20,30);
		new ArgumentConstructor (25,15.3f);
	}

}
