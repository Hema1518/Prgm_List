package javaPackage3;

public class StaticMethod1 
{
public static void main(String args []) 
  {
	System.out.println("addition and substraction");
	StaticMethod1.addition();
	StaticMethod1.substraction();
   }
    //static method 1
    public static void addition()
   {
    System.out.println(20+10);	
   } 
    //static method 2
    public static void substraction()
    {
	 System.out.println(20-10);
    }
}