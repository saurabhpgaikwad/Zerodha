package Assignment;

public class LessThanGreaterThan 
{
	public static void m1(int num1, int num2)
	{
		if (num1 > num2 )
		{
			System.out.println(num1+" is greater than "+num2);
		}
		else 
		{
			System.out.println(num2+" is gteater than "+num1);
		}
		
		       int a=5;
		       int b=8;
		       System.out.println( Math.max(a,b) );
		
//		 int num1= 5;
//		 int num2= 8;
//		 int largeNo = num1 > num2 ?  num1: num2;
//	     System.out.println(largeNo);
	}
	
	
	public static void main(String[] args) 
	{
		LessThanGreaterThan.m1(180, 180);
	}

}
