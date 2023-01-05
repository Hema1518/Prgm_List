package constructorExample;

public class DefaultConstructor2 {
	
	String a;            //declaration
	
	DefaultConstructor2()
	{
		a="KITS RAMTEK";   //initialization
	}
	
	public void Collegename()
	{
		System.out.println(a);    //usage
	}
	
	public static void main(String args[])
	{
		DefaultConstructor2 a=new DefaultConstructor2();
		a.Collegename();
		
	}

}
