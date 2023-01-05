package constructorTypes;

public class DefaultConstructor {
	
	static double a;      //default constructor
	boolean xyz;          //default constructor
	
	public void test()
	{
		System.out.println(a);
		System.out.println(xyz);
	}

	public static void main(String args[])
	{
		DefaultConstructor d =new DefaultConstructor();
		d.test();
	}
	
}
