package methodCalling;

public class ClassA{      //Method calling within class without args

		//static method
		public static void test1()
		  {
			System.out.println("Java is platform independent language.");
		  }
		
		public void test2()
		{
			System.out.println("Java is object oriented language");
		}
		
		public static void main(String args[])
		{
			ClassA.test1();
			test1();
			
			ClassA s=new ClassA();
			s.test2();
			s.test2();
			s.test2();
			
			
		}
		

	}

