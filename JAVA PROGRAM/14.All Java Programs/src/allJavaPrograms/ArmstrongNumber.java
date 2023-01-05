package allJavaPrograms;

public class ArmstrongNumber {
	
	public static void main(String args [])
	{
		int n=371,num,temp,total=0;
		
		num=n;
		while(num!=0)
		{
			temp=num%10;
			total=total+temp*temp*temp;
			num=num/10;
		}
		
		if(total==n)
			System.out.println(n + " is an Armstrong number");
		else
			System.out.println(n + " is not an Armstrong number");
	}

}
