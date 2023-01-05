package constructorTypes;

public class ZeroArgumentConstructor2{
			
			ZeroArgumentConstructor2()                //zero-argument constructor
	    	{
				System.out.println("Constructor with no-argument");

		    }

			ZeroArgumentConstructor2(String a)                //argument constructor
	    	{
				System.out.println("Constructor with String argument");

		    }
			
			ZeroArgumentConstructor2(int b)                //argument constructor
	    	{
				System.out.println("Constructor with integer argument");

		    }
		    
		    public static void main(String args[])
		    {
		    	new ZeroArgumentConstructor2();
		    	new ZeroArgumentConstructor2("cdef");
		    	new ZeroArgumentConstructor2(5);
		    }

}





