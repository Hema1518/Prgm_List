package javaPackage3;

public class Mixing2Methods {
	public static void main(String args[])
	{
		Mixing2Methods.longest();
		Mixing2Methods R=new Mixing2Methods();
		R.shortest();
		
	}

	//Static Method
	public static void longest()
	{
		System.out.println("Longest River=GANGA");
	}
	
	//Non-Static Method
	public void shortest()
	{
		System.out.println("Shortest River=ARVARI");
	}
}
