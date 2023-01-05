package javaPackage3;

public class NonStatic1 {
	public static void main(String args[])
	{
		NonStatic1 a=new NonStatic1();
				a.country();
		        a.capital();
	}
	
	//Non-Static1
	public void country()
	{
		System.out.println("INDIA");
	}

	//Non-Satic2
	public void capital()
	{
		System.out.println("DELHI");
	}
}
