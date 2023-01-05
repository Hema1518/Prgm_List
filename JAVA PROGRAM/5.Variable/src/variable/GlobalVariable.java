package variable;

public class GlobalVariable {
	 int x=50;
	 int y=20;
	 
	 public static void main(String args[])
	 {
		 GlobalVariable e=new GlobalVariable();
		 e.mul();
		 int z=e.x+e.y;
		 System.out.println(z);
	 }
	 
	 public void mul()
	 {
		 int result=x*y;
				 System.out.println(result);
		 
		 
	 }
	
	
	
	
	
	

}
