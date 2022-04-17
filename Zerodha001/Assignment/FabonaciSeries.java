package Assignment;

public class FabonaciSeries 
{
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 1;                       
		int sum=0;                                
		                   System.out.println(sum);                      
		for(int i=1; i<=10; i++)                    
		{   
			sum = num1+ num2;            
			System.out.println(sum);
			
			num1=num2;     // for new loop num1 replace by old num2 value
			num2=sum;      // for new loop num2 replace by new value (sum) 
		}	
	}
}
