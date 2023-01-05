package constructorExample;

public class ClassA {
	String city;       //declaration
	
	ClassA()
	{
		  city="PUNE";     //initialisation
	}
	
	public void address()
	{
		System.out.println(city);   //usage
	}
	
	public static void main(String args[])
	{
		ClassA a=new ClassA();
		a.address();
	}
}
