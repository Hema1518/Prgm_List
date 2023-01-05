package constructorExample;

public class ClassC {
	
	int a;
	ClassC()
	{
		a=10;
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		new ClassC();
		
	}

}
