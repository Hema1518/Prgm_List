package constructorExample;

public class DefaultConstructor {
	
	static double a;
	boolean xyz;
	
	public void test()
	{
		System.out.println(a);
		System.out.println(xyz);
	}

	public static void main(String args[])
	{
		DefaultConstructor a=new DefaultConstructor();
		a.test();
	}
}
