package constructorTypes;

public class ZeroArgumentConstructor {
		
		String a;                //declaration
		
		ZeroArgumentConstructor ()                //zero-argument constructor
    	{
			a="College of Engg";       //constructor name=Class name

	    }

	    public void college()
	    {
		  System.out.println(a);
	    }
	    
	    public static void main(String args[])
	    {
	    	ZeroArgumentConstructor  a=new ZeroArgumentConstructor ();
	    	a.college();
	    }

	 }

