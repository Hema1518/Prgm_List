package constructorExample;

public class ClassB {
	   int a;
	   String xyz;
	   
	   
	  public void test()        //constructor ex(default value)
	  {
		  System.out.println(a);
		  System.out.println(xyz);
	  }
	  
	  public static void main(String args[])
	  {
		  ClassB b=new ClassB();
		  b.test();
		  
	  }

}
