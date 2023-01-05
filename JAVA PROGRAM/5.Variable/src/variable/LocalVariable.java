package variable;

public class LocalVariable {
	
public static void main(String args[])
{
    LocalVariable x=new LocalVariable();
    x.add();
    x.sub();

}

   public void add()
      {
              int a=20;
              int b=30;
              int c=a+b; 
              System.out.println(c);

      }
   public void sub()
      {
	   int a=20;
	   int b=30;
	   int d=b-a;
	   System.out.println(d);
      }
      

}
