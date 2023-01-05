package variable;

public class StaticVariable {
	
        static int num1=200;
        static int num2=100;
   
        public void add()
   { 
	   int d=num1+num2;
	   System.out.println(d);
   }
   
        public static void sub()
   {
	    int e=num1-num2;
	    System.out.println(e);
   }
        public static void main(String args[])
   {
	   
	   StaticVariable s=new StaticVariable();
	   s.add();
	   s.sub();
   }
	
	
	
}
