package relationalOperator;

public class AssignmentBitwiseOperator {
	
	public static void main(String args[])
	
	{
		
		//And operator
		  System.out.println((15>10)&(23<21)&(28>45)&(60<70));
		  System.out.println((55>29)&(34<67)&(80>49)&(60<69));
		  
		  //Or operator
		  System.out.println((15<10)|(23<21)|(28>45)|(70<60));
		  System.out.println((55>29)|(34<67)|(80>49)|(60<69));
		  
	       //Xor operator
		  System.out.println(!(66>30));
		  System.out.println(!(10>62));
		
		
	}

}
