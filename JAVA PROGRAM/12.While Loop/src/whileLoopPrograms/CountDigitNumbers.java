package whileLoopPrograms;

public class CountDigitNumbers {
	//WAP to count of digit in number.
	
	public static void main(String args [])
	{

	
	int num=15300;
	int counter=0;
	
	while(num>0)
	{
		num=num/10;
		counter++;
	}
	
    System.out.println(counter);
}
}
